package com.epi.j2ee.domain;

import java.io.Serializable;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "RENDEZVOUS")
public class RendezVous implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRDV;
    @Temporal(value=TemporalType.DATE)
    private Date dateRDV;
    private String heureRDV;
    @Column(name = "sujetRDV", length = 200)
    private String sujetRDV;
    private String status;
    @ManyToOne()
    @JoinColumn(name = "idPatient")
    private Patient patient;

    public RendezVous() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RendezVous(Date dateRDV, String heureRDV, String sujetRDV, String status) {
        this.dateRDV = dateRDV;
        this.heureRDV = heureRDV;
        this.sujetRDV = sujetRDV;
        this.status = status;
    }

    public int getIdRDV() {
        return idRDV;
    }

    public void setIdRDV(int idRDV) {
        this.idRDV = idRDV;
    }

    public Date getDateRDV() {
        return dateRDV;
    }

    public void setDateRDV(Date dateRDV) {
        this.dateRDV = dateRDV;
    }

    public String getHeureRDV() {
        return heureRDV;
    }

    public void setHeureRDV(String heureRDV) {
        this.heureRDV = heureRDV;
    }
    public String getSujetRDV() {
        return sujetRDV;
    }

    public void setSujetRDV(String sujetRDV) {
        this.sujetRDV = sujetRDV;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "RendezVous{" + "idRDV=" + idRDV + ", dateRDV=" + dateRDV + ", heureRDV=" + heureRDV + ", sujetRDV=" + sujetRDV + ", status=" + status + ", patient=" + patient + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idRDV;
        hash = 23 * hash + (this.dateRDV != null ? this.dateRDV.hashCode() : 0);
        hash = 23 * hash + (this.heureRDV != null ? this.heureRDV.hashCode() : 0);
        hash = 23 * hash + (this.sujetRDV != null ? this.sujetRDV.hashCode() : 0);
        hash = 23 * hash + (this.status != null ? this.status.hashCode() : 0);
        hash = 23 * hash + (this.patient != null ? this.patient.hashCode() : 0);
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
        final RendezVous other = (RendezVous) obj;
        if (this.idRDV != other.idRDV) {
            return false;
        }
        if ((this.heureRDV == null) ? (other.heureRDV != null) : !this.heureRDV.equals(other.heureRDV)) {
            return false;
        }
        if ((this.sujetRDV == null) ? (other.sujetRDV != null) : !this.sujetRDV.equals(other.sujetRDV)) {
            return false;
        }
        if ((this.status == null) ? (other.status != null) : !this.status.equals(other.status)) {
            return false;
        }
        if (this.dateRDV != other.dateRDV && (this.dateRDV == null || !this.dateRDV.equals(other.dateRDV))) {
            return false;
        }
        if (this.patient != other.patient && (this.patient == null || !this.patient.equals(other.patient))) {
            return false;
        }
        return true;
    }

}
