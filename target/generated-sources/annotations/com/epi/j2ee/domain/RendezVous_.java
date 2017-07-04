package com.epi.j2ee.domain;

import com.epi.j2ee.domain.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T07:53:53")
@StaticMetamodel(RendezVous.class)
public class RendezVous_ { 

    public static volatile SingularAttribute<RendezVous, Date> dateRDV;
    public static volatile SingularAttribute<RendezVous, String> heureRDV;
    public static volatile SingularAttribute<RendezVous, Patient> patient;
    public static volatile SingularAttribute<RendezVous, String> sujetRDV;
    public static volatile SingularAttribute<RendezVous, Integer> idRDV;
    public static volatile SingularAttribute<RendezVous, String> status;

}