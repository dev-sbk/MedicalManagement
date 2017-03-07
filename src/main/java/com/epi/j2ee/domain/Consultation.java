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
@Table(name="CONSULTATIONS")
public class Consultation implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCons;
	@Convert(converter=LocalDatePersistenceConverter.class)
	private LocalDate dateCons;
	@Column(name="traitementCons",length=255)
	private String traitementCons;
	@Column(name="diagCons",length=255)
	private String diagCons;
	@Column(name="repos",length=255)
	private String repos;

	public Consultation() {
		super();
	}

	public Consultation(LocalDate dateCons, String traitementCons, String diagCons, String repos) {
		super();
		this.dateCons = dateCons;
		this.traitementCons = traitementCons;
		this.diagCons = diagCons;
		this.repos = repos;
	}

	public int getIdCons() {
		return idCons;
	}

	public void setIdCons(int idCons) {
		this.idCons = idCons;
	}

	public LocalDate getDateCons() {
		return dateCons;
	}

	public void setDateCons(LocalDate dateCons) {
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

	@Override
	public String toString() {
		return "Consultation [idCons=" + idCons + ", dateCons=" + dateCons + ", traitementCons=" + traitementCons
				+ ", diagCons=" + diagCons + ", repos=" + repos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCons == null) ? 0 : dateCons.hashCode());
		result = prime * result + ((diagCons == null) ? 0 : diagCons.hashCode());
		result = prime * result + idCons;
		result = prime * result + ((repos == null) ? 0 : repos.hashCode());
		result = prime * result + ((traitementCons == null) ? 0 : traitementCons.hashCode());
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
		Consultation other = (Consultation) obj;
		if (dateCons == null) {
			if (other.dateCons != null)
				return false;
		} else if (!dateCons.equals(other.dateCons))
			return false;
		if (diagCons == null) {
			if (other.diagCons != null)
				return false;
		} else if (!diagCons.equals(other.diagCons))
			return false;
		if (idCons != other.idCons)
			return false;
		if (repos == null) {
			if (other.repos != null)
				return false;
		} else if (!repos.equals(other.repos))
			return false;
		if (traitementCons == null) {
			if (other.traitementCons != null)
				return false;
		} else if (!traitementCons.equals(other.traitementCons))
			return false;
		return true;
	}

}
