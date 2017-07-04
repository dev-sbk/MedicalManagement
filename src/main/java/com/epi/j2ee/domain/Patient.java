package com.epi.j2ee.domain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PATIENTS")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPat;
    @Column(name = "nomPat", length = 30)
    private String nomPat;
    @Column(name = "prenomPat", length = 30)
    private String prenomPat;
    @Column(name = "adressePat", length = 50)
    private String adressePat;
    @Column(name = "statutsPat", length = 30)
    private String statutsPat;
    @Temporal(value = TemporalType.DATE)
    private Date dateNaissancePat;
    @Column(name = "telPat", length = 30)
    private String telPat;
    @Column(name = "matricule", length = 30)
    private String matricule;
    @Column(name = "genre", length = 30)
    private String genre;
    public Patient() {
        super();
    }

    public Patient(String nomPat, String prenomPat, String statutsPat, Date dateNaissancePat,
            String adressePat, String telPat, String matricule, String genre) {
        super();
        this.nomPat = nomPat;
        this.prenomPat = prenomPat;

        this.statutsPat = statutsPat;
        this.dateNaissancePat = dateNaissancePat;
        this.adressePat = adressePat;
        this.telPat = telPat;
        this.matricule = matricule;
        this.genre = genre;
    }

    public int getIdPat() {
        return idPat;
    }

    public void setIdPat(int idPat) {
        this.idPat = idPat;
    }

    public String getNomPat() {
        return nomPat;
    }

    public void setNomPat(String nomPat) {
        this.nomPat = nomPat;
    }

    public String getPrenomPat() {
        return prenomPat;
    }

    public void setPrenomPat(String prenomPat) {
        this.prenomPat = prenomPat;
    }

    public String getStatutsPat() {
        return statutsPat;
    }

    public void setStatutsPat(String statutsPat) {
        this.statutsPat = statutsPat;
    }

    public Date getDateNaissancePat() {
        return dateNaissancePat;
    }

    public void setDateNaissancePat(Date dateNaissancePat) {
        this.dateNaissancePat = dateNaissancePat;
    }

    public String getAdressePat() {
        return adressePat;
    }

    public void setAdressePat(String adressePat) {
        this.adressePat = adressePat;
    }

    public String getTelPat() {
        return telPat;
    }

    public void setTelPat(String telPat) {
        this.telPat = telPat;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

   

}
