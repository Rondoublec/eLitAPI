package fr.rbo.elitapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Ouvrage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ouvrageId;
    private String ouvrageReference;
    private String ouvrageTitre;
    private String ouvrageAuteur;
    private String ouvrageStyle;
    private String ouvrageResume;
    private String ouvrageLocalisation;
    private String ouvrageQuantite;

   @OneToMany(mappedBy="ouvrageEmprunt")
    private List<Emprunt> emprunts;

    public Ouvrage() { super(); }

    public Long getOuvrageId() {
        return ouvrageId;
    }

    public void setOuvrageId(Long ouvrageId) {
        this.ouvrageId = ouvrageId;
    }

    public String getOuvrageReference() {
        return ouvrageReference;
    }

    public void setOuvrageReference(String ouvrageReference) {
        this.ouvrageReference = ouvrageReference;
    }

    public String getOuvrageTitre() {
        return ouvrageTitre;
    }

    public void setOuvrageTitre(String ouvrageTitre) {
        this.ouvrageTitre = ouvrageTitre;
    }

    public String getOuvrageAuteur() {
        return ouvrageAuteur;
    }

    public void setOuvrageAuteur(String ouvrageAuteur) {
        this.ouvrageAuteur = ouvrageAuteur;
    }

    public String getOuvrageStyle() {
        return ouvrageStyle;
    }

    public void setOuvrageStyle(String ouvrageStyle) {
        this.ouvrageStyle = ouvrageStyle;
    }

    public String getOuvrageResume() {
        return ouvrageResume;
    }

    public void setOuvrageResume(String ouvrageResume) {
        this.ouvrageResume = ouvrageResume;
    }

    public String getOuvrageLocalisation() {
        return ouvrageLocalisation;
    }

    public void setOuvrageLocalisation(String ouvrageLocalisation) {
        this.ouvrageLocalisation = ouvrageLocalisation;
    }

    public String getOuvrageQuantite() {
        return ouvrageQuantite;
    }

    public void setOuvrageQuantite(String ouvrageQuantite) {
        this.ouvrageQuantite = ouvrageQuantite;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }
}
