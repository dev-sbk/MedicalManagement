package com.epi.j2ee.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 *
 * @author Saber Ben Khalifa
 *
 */
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u where u.type = :type")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotNull
    @Length(min = 3, max = 255)
    @Id
    private String username;
    @Column(name = "nom", length = 30)
    private String nom;
    @Column(name = "prenom", length = 30)
    private String prenom;
    @Column(name = "adresse", length = 30)
    private String adresse;
    @Column(name = "tel", length = 30)
    private String tel;

    @Column(name = "password", length = 255)
    private String password;
    @Column(name = "TYPE", insertable = false, updatable = false)
    private String type;
    @Column(name = "enabled")
    private boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USERS_ROLES")
    private Collection<Role> roles;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String username, String nom, String prenom, String adresse, String tel, String password, String type, boolean enabled) {
        this.username = username;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.password = md5PasswordEncoder(password);
        this.type = type;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = md5PasswordEncoder(password);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel + ", password=" + password + ", type=" + type + ", enabled=" + enabled + ", roles=" + roles + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.username != null ? this.username.hashCode() : 0);
        hash = 97 * hash + (this.nom != null ? this.nom.hashCode() : 0);
        hash = 97 * hash + (this.prenom != null ? this.prenom.hashCode() : 0);
        hash = 97 * hash + (this.adresse != null ? this.adresse.hashCode() : 0);
        hash = 97 * hash + (this.tel != null ? this.tel.hashCode() : 0);
        hash = 97 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 97 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 97 * hash + (this.enabled ? 1 : 0);
        hash = 97 * hash + (this.roles != null ? this.roles.hashCode() : 0);
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
        final User other = (User) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if ((this.username == null) ? (other.username != null) : !this.username.equals(other.username)) {
            return false;
        }
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.prenom == null) ? (other.prenom != null) : !this.prenom.equals(other.prenom)) {
            return false;
        }
        if ((this.adresse == null) ? (other.adresse != null) : !this.adresse.equals(other.adresse)) {
            return false;
        }
        if ((this.tel == null) ? (other.tel != null) : !this.tel.equals(other.tel)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.roles != other.roles && (this.roles == null || !this.roles.equals(other.roles))) {
            return false;
        }
        return true;
    }

    /**
     * Cette methode permet de crypter le mot de passe en MD5
     *
     * @param password
     * @return
     */
    public String md5PasswordEncoder(String password) {
        Md5PasswordEncoder md5 = new Md5PasswordEncoder();
        return md5.encodePassword(password, null);
    }
}
