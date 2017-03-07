package com.epi.j2ee.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Table;

import com.epi.j2ee.converter.LocalDatePersistenceConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "FACTURES")
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFact;
	@Column(name = "montantTotFact")
	private double montantTotFact;
	@Convert(converter = LocalDatePersistenceConverter.class)
	private LocalDate dateFact;
	@Column(name = "montantFact")
	private double montantFact;
	@Column(name = "resteFact")
	private double resteFact;

	public Facture() {
		super();
	}

	public Facture(double montantTotFact, LocalDate dateFact, double montantFact, double resteFact) {
		super();
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

	public LocalDate getDateFact() {
		return dateFact;
	}

	public void setDateFact(LocalDate dateFact) {
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
		return "Facture [idFact=" + idFact + ", montantTotFact=" + montantTotFact + ", dateFact=" + dateFact
				+ ", montantFact=" + montantFact + ", resteFact=" + resteFact + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateFact == null) ? 0 : dateFact.hashCode());
		result = prime * result + idFact;
		long temp;
		temp = Double.doubleToLongBits(montantFact);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(montantTotFact);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(resteFact);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Facture other = (Facture) obj;
		if (dateFact == null) {
			if (other.dateFact != null)
				return false;
		} else if (!dateFact.equals(other.dateFact))
			return false;
		if (idFact != other.idFact)
			return false;
		if (Double.doubleToLongBits(montantFact) != Double.doubleToLongBits(other.montantFact))
			return false;
		if (Double.doubleToLongBits(montantTotFact) != Double.doubleToLongBits(other.montantTotFact))
			return false;
		if (Double.doubleToLongBits(resteFact) != Double.doubleToLongBits(other.resteFact))
			return false;
		return true;
	}

}
