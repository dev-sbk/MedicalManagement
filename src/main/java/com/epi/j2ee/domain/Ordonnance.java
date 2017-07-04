package com.epi.j2ee.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORDONNANCES")
public class Ordonnance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrd;
    @Temporal(TemporalType.DATE)
    private Date dateOrd;
    @Column(name = "descrption")
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCons")
    private Consultation consultation;

    public Ordonnance() {
        super();
    }

    public Ordonnance(Date dateOrd, String description) {
        this.dateOrd = dateOrd;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ordonnance{" + "idOrd=" + idOrd + ", dateOrd=" + dateOrd + ", description=" + description + ", consultation=" + consultation + '}';
    }

    public int getIdOrd() {
        return idOrd;
    }

    public void setIdOrd(int idOrd) {
        this.idOrd = idOrd;
    }

    public Date getDateOrd() {
        return dateOrd;
    }

    public void setDateOrd(Date dateOrd) {
        this.dateOrd = dateOrd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idOrd;
        hash = 79 * hash + (this.dateOrd != null ? this.dateOrd.hashCode() : 0);
        hash = 79 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 79 * hash + (this.consultation != null ? this.consultation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordonnance other = (Ordonnance) obj;
        if (this.idOrd != other.idOrd) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if (this.dateOrd != other.dateOrd && (this.dateOrd == null || !this.dateOrd.equals(other.dateOrd))) {
            return false;
        }
        if (this.consultation != other.consultation && (this.consultation == null || !this.consultation.equals(other.consultation))) {
            return false;
        }
        return true;
    }

}
