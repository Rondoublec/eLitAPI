package fr.clientui.beans;

public class OuvrageBean {

    private Long ouvrageId;
    private String ouvrageReference;
    private String ouvrageTitre;
    private String ouvrageAuteur;
    private String ouvrageStyle;
    private String ouvrageResume;
    private String ouvrageLocalisation;
    private String ouvrageQuantite;

    public OuvrageBean() {
    }

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

    @Override
    public String toString() {
        return "OuvrageBean{" +
                "ouvrageId=" + ouvrageId +
                ", ouvrageReference='" + ouvrageReference + '\'' +
                ", ouvrageTitre='" + ouvrageTitre + '\'' +
                ", ouvrageAuteur='" + ouvrageAuteur + '\'' +
                ", ouvrageStyle='" + ouvrageStyle + '\'' +
                ", ouvrageResume='" + ouvrageResume + '\'' +
                ", ouvrageLocalisation='" + ouvrageLocalisation + '\'' +
                ", ouvrageQuantite='" + ouvrageQuantite + '\'' +
                '}';
    }

}
