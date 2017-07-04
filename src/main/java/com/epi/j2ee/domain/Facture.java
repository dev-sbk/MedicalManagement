package com.epi.j2ee.domain;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "FACTURES")
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFact;
    @Column(name = "montantTotFact")
    private double montantTotFact;
    @Temporal(TemporalType.DATE)
    private Date dateFact;
    @Column(name = "montantFact")
    private double montantFact;
    @Column(name = "resteFact")
    private double resteFact;

    public Facture() {
        super();
    }

    public Facture(double montantTotFact, Date dateFact, double montantFact, double resteFact) {
        this.montantTotFact = montantTotFact;
        this.dateFact = dateFact;
        this.montantFact = montantFact;
        this.resteFact = resteFact;
    }

    public int getIdFact() {
        return idFact;
    }

    public void setIdFact(int idFact) {
        this.idFact = idFact;
    }

    public double getMontantTotFact() {
        return montantTotFact;
    }

    public void setMontantTotFact(double montantTotFact) {
        this.montantTotFact = montantTotFact;
    }

    public Date getDateFact() {
        return dateFact;
    }

    public void setDateFact(Date dateFact) {
        this.dateFact = dateFact;
    }

    public double getMontantFact() {
        return montantFact;
    }

    public void setMontantFact(double montantFact) {
        this.montantFact = montantFact;
    }

    public double getResteFact() {
        return resteFact;
    }

    public void setResteFact(double resteFact) {
        this.resteFact = resteFact;
    }

    @Override
    public String toString() {
        return "Facture{" + "idFact=" + idFact + ", montantTotFact=" + montantTotFact + ", dateFact=" + dateFact + ", montantFact=" + montantFact + ", resteFact=" + resteFact + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idFact;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.montantTotFact) ^ (Double.doubleToLongBits(this.montantTotFact) >>> 32));
        hash = 89 * hash + (this.dateFact != null ? this.dateFact.hashCode() : 0);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.montantFact) ^ (Double.doubleToLongBits(this.montantFact) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.resteFact) ^ (Double.doubleToLongBits(this.resteFact) >>> 32));
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
        final Facture other = (Facture) obj;
        if (this.idFact != other.idFact) {
            return false;
        }
        if (Double.doubleToLongBits(this.montantTotFact) != Double.doubleToLongBits(other.montantTotFact)) {
            return false;
        }
        if (Double.doubleToLongBits(this.montantFact) != Double.doubleToLongBits(other.montantFact)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resteFact) != Double.doubleToLongBits(other.resteFact)) {
            return false;
        }
        if (this.dateFact != other.dateFact && (this.dateFact == null || !this.dateFact.equals(other.dateFact))) {
            return false;
        }
        return true;
    }

}
