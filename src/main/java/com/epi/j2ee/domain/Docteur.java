package com.epi.j2ee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "DOCTEURS")
public class Docteur implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDoc;
	@Column(name="nomDoc",length=30)
	private String nomDoc;
	@Column(name="prenomDoc",length=30)
	private String prenomDoc;
	@Column(name="adresseDoc",length=30)
	private String adresseDoc;
	@Column(name="telDoc",length=30)
	private String telDoc;
	@Column(name="logDoc",length=30)
	private String logDoc;
	@Column(name="passDoc",length=255)
	private String passDoc;
	public Docteur() {
		super();
	}

	public Docteur(String nomDoc, String prenomDoc, String adresseDoc, String telDoc) {
		super();
		this.nomDoc = nomDoc;
		this.prenomDoc = prenomDoc;
		this.adresseDoc = adresseDoc;
		this.telDoc = telDoc;
	}

	public Docteur(String nomDoc, String prenomDoc, String adresseDoc, String telDoc, String logDoc, String passDoc) {
		super();
		this.nomDoc = nomDoc;
		this.prenomDoc = prenomDoc;
		this.adresseDoc = adresseDoc;
		this.telDoc = telDoc;
		this.logDoc = logDoc;
		this.passDoc = passDoc;
	}

	public int getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	public String getNomDoc() {
		return nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	public String getPrenomDoc() {
		return prenomDoc;
	}

	public void setPrenomDoc(String prenomDoc) {
		this.prenomDoc = prenomDoc;
	}

	public String getAdresseDoc() {
		return adresseDoc;
	}

	public void setAdresseDoc(String adresseDoc) {
		this.adresseDoc = adresseDoc;
	}

	public String getTelDoc() {
		return telDoc;
	}

	public void setTelDoc(String telDoc) {
		this.telDoc = telDoc;
	}

	public String getLogDoc() {
		return logDoc;
	}

	public void setLogDoc(String logDoc) {
		this.logDoc = logDoc;
	}

	public String getPassDoc() {
		return passDoc;
	}

	public void setPassDoc(String passDoc) {
		this.passDoc = passDoc;
	}

	@Override
	public String toString() {
		return "Docteur [idDoc=" + idDoc + ", nomDoc=" + nomDoc + ", prenomDoc=" + prenomDoc + ", adresseDoc="
				+ adresseDoc + ", telDoc=" + telDoc + ", logDoc=" + logDoc + ", passDoc=" + passDoc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresseDoc == null) ? 0 : adresseDoc.hashCode());
		result = prime * result + idDoc;
		result = prime * result + ((logDoc == null) ? 0 : logDoc.hashCode());
		result = prime * result + ((nomDoc == null) ? 0 : nomDoc.hashCode());
		result = prime * result + ((passDoc == null) ? 0 : passDoc.hashCode());
		result = prime * result + ((prenomDoc == null) ? 0 : prenomDoc.hashCode());
		result = prime * result + ((telDoc == null) ? 0 : telDoc.hashCode());
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
		Docteur other = (Docteur) obj;
		if (adresseDoc == null) {
			if (other.adresseDoc != null)
				return false;
		} else if (!adresseDoc.equals(other.adresseDoc))
			return false;
		if (idDoc != other.idDoc)
			return false;
		if (logDoc == null) {
			if (other.logDoc != null)
				return false;
		} else if (!logDoc.equals(other.logDoc))
			return false;
		if (nomDoc == null) {
			if (other.nomDoc != null)
				return false;
		} else if (!nomDoc.equals(other.nomDoc))
			return false;
		if (passDoc == null) {
			if (other.passDoc != null)
				return false;
		} else if (!passDoc.equals(other.passDoc))
			return false;
		if (prenomDoc == null) {
			if (other.prenomDoc != null)
				return false;
		} else if (!prenomDoc.equals(other.prenomDoc))
			return false;
		if (telDoc == null) {
			if (other.telDoc != null)
				return false;
		} else if (!telDoc.equals(other.telDoc))
			return false;
		return true;
	}

}
