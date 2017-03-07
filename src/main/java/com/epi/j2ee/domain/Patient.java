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
@Table(name = "PATIENTS")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPat;
	@Column(name = "nomPat", length = 30)
	private String nomPat;
	@Column(name = "prenomPat", length = 30)
	private String prenomPat;
	@Column(name = "civilitePat", length = 30)
	private String civilitePat;
	@Column(name = "statutsPat", length = 30)
	private String statutsPat;
	@Convert(converter = LocalDatePersistenceConverter.class)
	private LocalDate dateNaissancePat;
	@Column(name = "adressePat", length = 30)
	private String adressePat;
	@Column(name = "telPat", length = 30)
	private String telPat;
	@Column(name = "lieuPat", length = 30)
	private String lieuPat;
	@Column(name = "professionPat", length = 30)
	private String professionPat;
	@Column(name = "numSocialPat", length = 30)
	private String numSocialPat;
	@Column(name = "apciPat", length = 30)
	private String apciPat;
	@Column(name = "numCnamPat", length = 30)
	private String numCnamPat;
	@Column(name = "regimePat", length = 30)
	private String regimePat;
	@Column(name = "qualitePat", length = 30)
	private String qualitePat;

	public Patient() {
		super();
	}

	public Patient(String nomPat, String prenomPat, String civilitePat, String statutsPat, LocalDate dateNaissancePat,
			String adressePat, String telPat, String lieuPat, String professionPat, String numSocialPat, String apciPat,
			String numCnamPat, String regimePat, String qualitePat) {
		super();
		this.nomPat = nomPat;
		this.prenomPat = prenomPat;
		this.civilitePat = civilitePat;
		this.statutsPat = statutsPat;
		this.dateNaissancePat = dateNaissancePat;
		this.adressePat = adressePat;
		this.telPat = telPat;
		this.lieuPat = lieuPat;
		this.professionPat = professionPat;
		this.numSocialPat = numSocialPat;
		this.apciPat = apciPat;
		this.numCnamPat = numCnamPat;
		this.regimePat = regimePat;
		this.qualitePat = qualitePat;
	}

	public int getIdPat() {
		return idPat;
	}

	public void setIdPat(int idPat) {
		this.idPat = idPat;
	}

	public String getNomPat() {
		return nomPat;
	}

	public void setNomPat(String nomPat) {
		this.nomPat = nomPat;
	}

	public String getPrenomPat() {
		return prenomPat;
	}

	public void setPrenomPat(String prenomPat) {
		this.prenomPat = prenomPat;
	}

	public String getCivilitePat() {
		return civilitePat;
	}

	public void setCivilitePat(String civilitePat) {
		this.civilitePat = civilitePat;
	}

	public String getStatutsPat() {
		return statutsPat;
	}

	public void setStatutsPat(String statutsPat) {
		this.statutsPat = statutsPat;
	}

	public LocalDate getDateNaissancePat() {
		return dateNaissancePat;
	}

	public void setDateNaissancePat(LocalDate dateNaissancePat) {
		this.dateNaissancePat = dateNaissancePat;
	}

	public String getAdressePat() {
		return adressePat;
	}

	public void setAdressePat(String adressePat) {
		this.adressePat = adressePat;
	}

	public String getTelPat() {
		return telPat;
	}

	public void setTelPat(String telPat) {
		this.telPat = telPat;
	}

	public String getLieuPat() {
		return lieuPat;
	}

	public void setLieuPat(String lieuPat) {
		this.lieuPat = lieuPat;
	}

	public String getProfessionPat() {
		return professionPat;
	}

	public void setProfessionPat(String professionPat) {
		this.professionPat = professionPat;
	}

	public String getNumSocialPat() {
		return numSocialPat;
	}

	public void setNumSocialPat(String numSocialPat) {
		this.numSocialPat = numSocialPat;
	}

	public String getApciPat() {
		return apciPat;
	}

	public void setApciPat(String apciPat) {
		this.apciPat = apciPat;
	}

	public String getNumCnamPat() {
		return numCnamPat;
	}

	public void setNumCnamPat(String numCnamPat) {
		this.numCnamPat = numCnamPat;
	}

	public String getRegimePat() {
		return regimePat;
	}

	public void setRegimePat(String regimePat) {
		this.regimePat = regimePat;
	}

	public String getQualitePat() {
		return qualitePat;
	}

	public void setQualitePat(String qualitePat) {
		this.qualitePat = qualitePat;
	}

	@Override
	public String toString() {
		return "Patient [idPat=" + idPat + ", nomPat=" + nomPat + ", prenomPat=" + prenomPat + ", civilitePat="
				+ civilitePat + ", statutsPat=" + statutsPat + ", dateNaissancePat=" + dateNaissancePat
				+ ", adressePat=" + adressePat + ", telPat=" + telPat + ", lieuPat=" + lieuPat + ", professionPat="
				+ professionPat + ", numSocialPat=" + numSocialPat + ", apciPat=" + apciPat + ", numCnamPat="
				+ numCnamPat + ", regimePat=" + regimePat + ", qualitePat=" + qualitePat + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adressePat == null) ? 0 : adressePat.hashCode());
		result = prime * result + ((apciPat == null) ? 0 : apciPat.hashCode());
		result = prime * result + ((civilitePat == null) ? 0 : civilitePat.hashCode());
		result = prime * result + ((dateNaissancePat == null) ? 0 : dateNaissancePat.hashCode());
		result = prime * result + idPat;
		result = prime * result + ((lieuPat == null) ? 0 : lieuPat.hashCode());
		result = prime * result + ((nomPat == null) ? 0 : nomPat.hashCode());
		result = prime * result + ((numCnamPat == null) ? 0 : numCnamPat.hashCode());
		result = prime * result + ((numSocialPat == null) ? 0 : numSocialPat.hashCode());
		result = prime * result + ((prenomPat == null) ? 0 : prenomPat.hashCode());
		result = prime * result + ((professionPat == null) ? 0 : professionPat.hashCode());
		result = prime * result + ((qualitePat == null) ? 0 : qualitePat.hashCode());
		result = prime * result + ((regimePat == null) ? 0 : regimePat.hashCode());
		result = prime * result + ((statutsPat == null) ? 0 : statutsPat.hashCode());
		result = prime * result + ((telPat == null) ? 0 : telPat.hashCode());
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
		Patient other = (Patient) obj;
		if (adressePat == null) {
			if (other.adressePat != null)
				return false;
		} else if (!adressePat.equals(other.adressePat))
			return false;
		if (apciPat == null) {
			if (other.apciPat != null)
				return false;
		} else if (!apciPat.equals(other.apciPat))
			return false;
		if (civilitePat == null) {
			if (other.civilitePat != null)
				return false;
		} else if (!civilitePat.equals(other.civilitePat))
			return false;
		if (dateNaissancePat == null) {
			if (other.dateNaissancePat != null)
				return false;
		} else if (!dateNaissancePat.equals(other.dateNaissancePat))
			return false;
		if (idPat != other.idPat)
			return false;
		if (lieuPat == null) {
			if (other.lieuPat != null)
				return false;
		} else if (!lieuPat.equals(other.lieuPat))
			return false;
		if (nomPat == null) {
			if (other.nomPat != null)
				return false;
		} else if (!nomPat.equals(other.nomPat))
			return false;
		if (numCnamPat == null) {
			if (other.numCnamPat != null)
				return false;
		} else if (!numCnamPat.equals(other.numCnamPat))
			return false;
		if (numSocialPat == null) {
			if (other.numSocialPat != null)
				return false;
		} else if (!numSocialPat.equals(other.numSocialPat))
			return false;
		if (prenomPat == null) {
			if (other.prenomPat != null)
				return false;
		} else if (!prenomPat.equals(other.prenomPat))
			return false;
		if (professionPat == null) {
			if (other.professionPat != null)
				return false;
		} else if (!professionPat.equals(other.professionPat))
			return false;
		if (qualitePat == null) {
			if (other.qualitePat != null)
				return false;
		} else if (!qualitePat.equals(other.qualitePat))
			return false;
		if (regimePat == null) {
			if (other.regimePat != null)
				return false;
		} else if (!regimePat.equals(other.regimePat))
			return false;
		if (statutsPat == null) {
			if (other.statutsPat != null)
				return false;
		} else if (!statutsPat.equals(other.statutsPat))
			return false;
		if (telPat == null) {
			if (other.telPat != null)
				return false;
		} else if (!telPat.equals(other.telPat))
			return false;
		return true;
	}

}
