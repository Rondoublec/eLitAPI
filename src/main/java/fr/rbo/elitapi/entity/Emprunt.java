package fr.rbo.elitapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Emprunt {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long empruntId;
        @ManyToOne
        private Ouvrage ouvrageEmprunt;
        @ManyToOne
        private User userEmprunt;
        private Date EmpruntDateDebut;
        private Date EmpruntDateFin;
        @Column(nullable = true)
        private Date EmpruntDateRetour;
        @Column(nullable = true)
        private Boolean EmpruntDateProlongation;

    public Emprunt() { super(); }

    public long getEmpruntId() {
        return empruntId;
    }

    public void setEmpruntId(long empruntId) {
        this.empruntId = empruntId;
    }

    public Ouvrage getOuvrageEmprunt() {
        return ouvrageEmprunt;
    }

    public void setOuvrageEmprunt(Ouvrage ouvrageEmprunt) {
        this.ouvrageEmprunt = ouvrageEmprunt;
    }

    public User getUserEmprunt() {
        return userEmprunt;
    }

    public void setUserEmprunt(User userEmprunt) {
        this.userEmprunt = userEmprunt;
    }

    public Date getEmpruntDateDebut() {
        return EmpruntDateDebut;
    }

    public void setEmpruntDateDebut(Date empruntDateDebut) {
        EmpruntDateDebut = empruntDateDebut;
    }

    public Date getEmpruntDateFin() {
        return EmpruntDateFin;
    }

    public void setEmpruntDateFin(Date empruntDateFin) {
        EmpruntDateFin = empruntDateFin;
    }

    public Date getEmpruntDateRetour() {
        return EmpruntDateRetour;
    }

    public void setEmpruntDateRetour(Date empruntDateRetour) {
        EmpruntDateRetour = empruntDateRetour;
    }

    public Boolean getEmpruntDateProlongation() {
        return EmpruntDateProlongation;
    }

    public void setEmpruntDateProlongation(Boolean empruntDateProlongation) {
        EmpruntDateProlongation = empruntDateProlongation;
    }
}
