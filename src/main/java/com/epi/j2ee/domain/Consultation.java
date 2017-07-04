package com.epi.j2ee.domain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CONSULTATIONS")
public class Consultation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCons;
    @Temporal(value = TemporalType.DATE)
    private Date dateCons;
    @Column(name = "traitementCons", length = 255)
    @Lob
    private String traitementCons;
    @Column(name = "diagCons", length = 255)
    private String diagCons;
    @Column(name = "repos", length = 255)
    private String repos;
    @Column(name = "heureCons", length = 255)
    private String heureCons;
    @Column(name = "sujetCons", length = 255)
    private String sujetCons;
    @ManyToOne()
    @JoinColumn(name = "idPat")
    private Patient patient;

    public Consultation() {
        super();
    }

    public Consultation(Date dateCons, String heureCons, String traitementCons, String diagCons, String repos, String sujetCons) {
        super();
        this.dateCons = dateCons;
        this.heureCons = heureCons;
        this.traitementCons = traitementCons;
        this.diagCons = diagCons;
        this.repos = repos;
        this.sujetCons = sujetCons;
    }

    public int getIdCons() {
        return idCons;
    }

    public String getSujetCons() {
        return sujetCons;
    }

    public void setSujetCons(String sujetCons) {
        this.sujetCons = sujetCons;
    }

    public String getHeureCons() {
        return heureCons;
    }

    public void setHeureCons(String heureCons) {
        this.heureCons = heureCons;
    }

    public void setIdCons(int idCons) {
        this.idCons = idCons;
    }

    public Date getDateCons() {
        return dateCons;
    }

    public void setDateCons(Date dateCons) {
        this.dateCons = dateCons;
    }

    public String getTraitementCons() {
        return traitementCons;
    }

    public void setTraitementCons(String traitementCons) {
        this.traitementCons = traitementCons;
    }

    public String getDiagCons() {
        return diagCons;
    }

    public void setDiagCons(String diagCons) {
        this.diagCons = diagCons;
    }

    public String getRepos() {
        return repos;
    }

    public void setRepos(String repos) {
        this.repos = repos;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Consultation [idCons=" + idCons + ", dateCons=" + dateCons + ", heureCons=" + heureCons + ", traitementCons=" + traitementCons
                + ", diagCons=" + diagCons + ", repos=" + repos + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateCons == null) ? 0 : dateCons.hashCode());
        result = prime * result + ((diagCons == null) ? 0 : diagCons.hashCode());
        result = prime * result + ((heureCons == null) ? 0 : heureCons.hashCode());
        result = prime * result + idCons;
        result = prime * result + ((repos == null) ? 0 : repos.hashCode());
        result = prime * result + ((traitementCons == null) ? 0 : traitementCons.hashCode());
        return result;
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
        Consultation other = (Consultation) obj;
        if (dateCons == null) {
            if (other.dateCons != null) {
                return false;
            }
        } else if (!dateCons.equals(other.dateCons)) {
            return false;
        }
        if (diagCons == null) {
            if (other.diagCons != null) {
                return false;
            }
        } else if (!diagCons.equals(other.diagCons)) {
            return false;
        }
        if (heureCons == null) {
            if (other.heureCons != null) {
                return false;
            }
        } else if (!diagCons.equals(other.diagCons)) {
            return false;
        }
        if (idCons != other.idCons) {
            return false;
        }
        if (repos == null) {
            if (other.repos != null) {
                return false;
            }
        } else if (!repos.equals(other.repos)) {
            return false;
        }
        if (traitementCons == null) {
            if (other.traitementCons != null) {
                return false;
            }
        } else if (!traitementCons.equals(other.traitementCons)) {
            return false;
        }
        return true;
    }

}
