package com.epi.j2ee.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue(value = "DOC")
@NamedQueries({
    @NamedQuery(name = "Docteur.findAll", query = "SELECT d FROM Docteur d")})
public class Docteur extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    public Docteur() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Docteur(String username, String nom, String prenom, String adresse, String tel, String password, String type, boolean enabled) {
        super(username, nom, prenom, adresse, tel, password, type, enabled);
    }
}
