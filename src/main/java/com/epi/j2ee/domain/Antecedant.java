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
@Table(name="ANTECEDANTS")
public class Antecedant implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAnt;
	@Convert(converter = LocalDatePersistenceConverter.class)
	private LocalDate dateAnt;
	@Column(name="description",length=255)
	private String description;

	public Antecedant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Antecedant(LocalDate dateAnt, String description) {
		super();
		this.dateAnt = dateAnt;
		this.description = description;
	}

	public int getIdAnt() {
		return idAnt;
	}

	public void setIdAnt(int idAnt) {
		this.idAnt = idAnt;
	}

	public LocalDate getDateAnt() {
		return dateAnt;
	}

	public void setDateAnt(LocalDate dateAnt) {
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
		return "Antecedant [idAnt=" + idAnt + ", dateAnt=" + dateAnt + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAnt == null) ? 0 : dateAnt.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + idAnt;
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
		Antecedant other = (Antecedant) obj;
		if (dateAnt == null) {
			if (other.dateAnt != null)
				return false;
		} else if (!dateAnt.equals(other.dateAnt))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idAnt != other.idAnt)
			return false;
		return true;
	}

}
