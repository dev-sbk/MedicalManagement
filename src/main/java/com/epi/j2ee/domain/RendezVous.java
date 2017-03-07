package com.epi.j2ee.domain;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Table;
import com.epi.j2ee.converter.LocalDatePersistenceConverter;
import com.epi.j2ee.converter.LocalDateTimePersistenceConverter;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Table(name = "RENDEZVOUS")
public class RendezVous implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRDV;
	@Convert(converter = LocalDatePersistenceConverter.class)
	private LocalDate dateRDV;
	@Convert(converter = LocalDateTimePersistenceConverter.class)
	private LocalTime heureRDV;

	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RendezVous(LocalDate dateRDV, LocalTime heureRDV) {
		super();
		this.dateRDV = dateRDV;
		this.heureRDV = heureRDV;
	}

	public int getIdRDV() {
		return idRDV;
	}

	public void setIdRDV(int idRDV) {
		this.idRDV = idRDV;
	}

	public LocalDate getDateRDV() {
		return dateRDV;
	}

	public void setDateRDV(LocalDate dateRDV) {
		this.dateRDV = dateRDV;
	}

	public LocalTime getHeureRDV() {
		return heureRDV;
	}

	public void setHeureRDV(LocalTime heureRDV) {
		this.heureRDV = heureRDV;
	}

	@Override
	public String toString() {
		return "RendezVous [idRDV=" + idRDV + ", dateRDV=" + dateRDV + ", heureRDV=" + heureRDV + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateRDV == null) ? 0 : dateRDV.hashCode());
		result = prime * result + ((heureRDV == null) ? 0 : heureRDV.hashCode());
		result = prime * result + idRDV;
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
		RendezVous other = (RendezVous) obj;
		if (dateRDV == null) {
			if (other.dateRDV != null)
				return false;
		} else if (!dateRDV.equals(other.dateRDV))
			return false;
		if (heureRDV == null) {
			if (other.heureRDV != null)
				return false;
		} else if (!heureRDV.equals(other.heureRDV))
			return false;
		if (idRDV != other.idRDV)
			return false;
		return true;
	}

}
