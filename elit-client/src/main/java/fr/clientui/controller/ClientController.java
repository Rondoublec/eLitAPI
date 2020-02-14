package fr.clientui.controller;

import fr.clientui.beans.OuvrageBean;
import fr.clientui.proxies.MicroserviceOuvragesProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collection;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;


@Controller
public class ClientController {

    @Autowired
    MicroserviceOuvragesProxy mOuvragesProxy;

    @RequestMapping(value={"/", "/Accueil"})
    public String accueil(Model model){

        PagedModel<EntityModel<OuvrageBean>> listeDesLivres = mOuvragesProxy.findAll();
        Collection<EntityModel<OuvrageBean>> ouvrages = listeDesLivres.getContent();
        model.addAttribute("ouvrages", ouvrages);
        return "Accueil";
    }

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public String details(@RequestParam("link") String link, Model model){

        int ouvrageId = Integer.parseInt(link.substring(link.lastIndexOf("/")+1));
        EntityModel<OuvrageBean> livre = mOuvragesProxy.findById(ouvrageId);
        model.addAttribute("livre", livre);
        model.addAttribute("lien", livre.getLink("self").get().getHref());
        return "Details";
    }
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail(@RequestParam("ref") String ref, Model model){

        EntityModel<OuvrageBean> livre = mOuvragesProxy.findByOuvrageReference(ref);
        model.addAttribute("livre", livre);
        model.addAttribute("lien", livre.getLink("self").get().getHref());
        return "Details";
    }

    @RequestMapping(value = "/supprime", method = RequestMethod.GET)
    public String supprime(@RequestParam("link") String link, Model model){

        int ouvrageId = Integer.parseInt(link.substring(link.lastIndexOf("/")+1));
        mOuvragesProxy.deleteById(ouvrageId);

        return "redirect:/Accueil";
    }

    @RequestMapping(value = "/info/{ouvrageId}", method = RequestMethod.GET)
    public String details(@PathVariable("ouvrageId") Long ouvrageId, Model model) {

        EntityModel<OuvrageBean> livre = mOuvragesProxy.findById(Math.toIntExact(ouvrageId));
        model.addAttribute("livre", livre);
        model.addAttribute("lien", livre.getLink("self").get().getHref());
        return "Details";
    }

}