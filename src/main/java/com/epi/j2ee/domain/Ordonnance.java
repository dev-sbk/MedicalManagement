package com.epi.j2ee.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.epi.j2ee.converter.LocalDatePersistenceConverter;

@Entity
@Table(name = "ORDONNANCES")
public class Ordonnance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrd;
	@Convert(converter = LocalDatePersistenceConverter.class)
	private LocalDate dateOrd;
	@Column(name = "qteOrd")
	private int qteOrd;
	@Column(name = "dureeOrd", length = 30)
	private String dureeOrd;
	@Column(name = "medicamentOrd", length = 255)
	private String medicamentOrd;

	public Ordonnance() {
		super();
	}

	public Ordonnance(LocalDate dateOrd, int qteOrd, String dureeOrd, String medicamentOrd) {
		super();
		this.dateOrd = dateOrd;
		this.qteOrd = qteOrd;
		this.dureeOrd = dureeOrd;
		this.medicamentOrd = medicamentOrd;
	}

	public int getIdOrd() {
		return idOrd;
	}

	public void setIdOrd(int idOrd) {
		this.idOrd = idOrd;
	}

	public LocalDate getDateOrd() {
		return dateOrd;
	}

	public void setDateOrd(LocalDate dateOrd) {
		this.dateOrd = dateOrd;
	}

	public int getQteOrd() {
		return qteOrd;
	}

	public void setQteOrd(int qteOrd) {
		this.qteOrd = qteOrd;
	}

	public String getDureeOrd() {
		return dureeOrd;
	}

	public void setDureeOrd(String dureeOrd) {
		this.dureeOrd = dureeOrd;
	}

	public String getMedicamentOrd() {
		return medicamentOrd;
	}

	public void setMedicamentOrd(String medicamentOrd) {
		this.medicamentOrd = medicamentOrd;
	}

	@Override
	public String toString() {
		return "Ordonnance [idOrd=" + idOrd + ", dateOrd=" + dateOrd + ", qteOrd=" + qteOrd + ", dureeOrd=" + dureeOrd
				+ ", medicamentOrd=" + medicamentOrd + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOrd == null) ? 0 : dateOrd.hashCode());
		result = prime * result + ((dureeOrd == null) ? 0 : dureeOrd.hashCode());
		result = prime * result + idOrd;
		result = prime * result + ((medicamentOrd == null) ? 0 : medicamentOrd.hashCode());
		result = prime * result + qteOrd;
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
		Ordonnance other = (Ordonnance) obj;
		if (dateOrd == null) {
			if (other.dateOrd != null)
				return false;
		} else if (!dateOrd.equals(other.dateOrd))
			return false;
		if (dureeOrd == null) {
			if (other.dureeOrd != null)
				return false;
		} else if (!dureeOrd.equals(other.dureeOrd))
			return false;
		if (idOrd != other.idOrd)
			return false;
		if (medicamentOrd == null) {
			if (other.medicamentOrd != null)
				return false;
		} else if (!medicamentOrd.equals(other.medicamentOrd))
			return false;
		if (qteOrd != other.qteOrd)
			return false;
		return true;
	}
}
