package com.epi.j2ee.domain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ASSISTANTES")
public class Assistante implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAssis;
	@Column(name="nomAssis",length=30)
	private String nomAssis;
	@Column(name="prenomAssis",length=30)
	private String prenomAssis;
	@Column(name="telAssis",length=30)
	private String telAssis;
	@Column(name="loginAssis",length=30)
	private String loginAssis;
	@Column(name="passwordAssis",length=255)
	private String passwordAssis;
	public Assistante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assistante(String nomAssis, String prenomAssis, String telAssis, String loginAssis, String passwordAssis) {
		super();
		this.nomAssis = nomAssis;
		this.prenomAssis = prenomAssis;
		this.telAssis = telAssis;
		this.loginAssis = loginAssis;
		this.passwordAssis = passwordAssis;
	}

	public int getIdAssis() {
		return idAssis;
	}

	public void setIdAssis(int idAssis) {
		this.idAssis = idAssis;
	}

	public String getNomAssis() {
		return nomAssis;
	}

	public void setNomAssis(String nomAssis) {
		this.nomAssis = nomAssis;
	}

	public String getPrenomAssis() {
		return prenomAssis;
	}

	public void setPrenomAssis(String prenomAssis) {
		this.prenomAssis = prenomAssis;
	}

	public String getTelAssis() {
		return telAssis;
	}

	public void setTelAssis(String telAssis) {
		this.telAssis = telAssis;
	}

	public String getLoginAssis() {
		return loginAssis;
	}

	public void setLoginAssis(String loginAssis) {
		this.loginAssis = loginAssis;
	}

	public String getPasswordAssis() {
		return passwordAssis;
	}

	public void setPasswordAssis(String passwordAssis) {
		this.passwordAssis = passwordAssis;
	}

	@Override
	public String toString() {
		return "Assistante [idAssis=" + idAssis + ", nomAssis=" + nomAssis + ", prenomAssis=" + prenomAssis
				+ ", telAssis=" + telAssis + ", loginAssis=" + loginAssis + ", passwordAssis=" + passwordAssis + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAssis;
		result = prime * result + ((loginAssis == null) ? 0 : loginAssis.hashCode());
		result = prime * result + ((nomAssis == null) ? 0 : nomAssis.hashCode());
		result = prime * result + ((passwordAssis == null) ? 0 : passwordAssis.hashCode());
		result = prime * result + ((prenomAssis == null) ? 0 : prenomAssis.hashCode());
		result = prime * result + ((telAssis == null) ? 0 : telAssis.hashCode());
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
		Assistante other = (Assistante) obj;
		if (idAssis != other.idAssis)
			return false;
		if (loginAssis == null) {
			if (other.loginAssis != null)
				return false;
		} else if (!loginAssis.equals(other.loginAssis))
			return false;
		if (nomAssis == null) {
			if (other.nomAssis != null)
				return false;
		} else if (!nomAssis.equals(other.nomAssis))
			return false;
		if (passwordAssis == null) {
			if (other.passwordAssis != null)
				return false;
		} else if (!passwordAssis.equals(other.passwordAssis))
			return false;
		if (prenomAssis == null) {
			if (other.prenomAssis != null)
				return false;
		} else if (!prenomAssis.equals(other.prenomAssis))
			return false;
		if (telAssis == null) {
			if (other.telAssis != null)
				return false;
		} else if (!telAssis.equals(other.telAssis))
			return false;
		return true;
	}

}
