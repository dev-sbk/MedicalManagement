package com.epi.j2ee.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ANTECEDANTS")
public class Antecedant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnt;
    @Temporal(TemporalType.DATE)
    private Date dateAnt;
    @Column(name = "description", length = 255)
    private String description;

    public Antecedant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Antecedant(int idAnt, Date dateAnt, String description) {
        this.idAnt = idAnt;
        this.dateAnt = dateAnt;
        this.description = description;
    }

    public int getIdAnt() {
        return idAnt;
    }

    public void setIdAnt(int idAnt) {
        this.idAnt = idAnt;
    }

    public Date getDateAnt() {
        return dateAnt;
    }

    public void setDateAnt(Date dateAnt) {
        this.dateAnt = dateAnt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Antecedant{" + "idAnt=" + idAnt + ", dateAnt=" + dateAnt + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.idAnt;
        hash = 61 * hash + (this.dateAnt != null ? this.dateAnt.hashCode() : 0);
        hash = 61 * hash + (this.description != null ? this.description.hashCode() : 0);
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
        final Antecedant other = (Antecedant) obj;
        if (this.idAnt != other.idAnt) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if (this.dateAnt != other.dateAnt && (this.dateAnt == null || !this.dateAnt.equals(other.dateAnt))) {
            return false;
        }
        return true;
    }

}
