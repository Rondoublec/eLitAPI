package fr.clientui.proxies;

import fr.clientui.beans.OuvrageBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "elitapi",url = "localhost:8088/api")
public interface MicroserviceOuvragesProxy {

    @GetMapping(value = "/ouvrages")
    PagedModel<EntityModel<OuvrageBean>> findAll();

    @GetMapping( value = "/ouvrages/{id}")
    EntityModel<OuvrageBean> findById(@PathVariable("id") int id);

    @GetMapping( value = "/ouvrages/{ouvrageReference}")
    EntityModel<OuvrageBean> findByOuvrageReference(@PathVariable("ouvrageReference") String ouvrageReference);

    @GetMapping( value = "/ouvrages/{id}")
    void deleteById(@PathVariable("id") int id);

}
