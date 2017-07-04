package com.epi.j2ee.domain;

import com.epi.j2ee.domain.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T07:53:53")
@StaticMetamodel(Consultation.class)
public class Consultation_ { 

    public static volatile SingularAttribute<Consultation, String> sujetCons;
    public static volatile SingularAttribute<Consultation, Integer> idCons;
    public static volatile SingularAttribute<Consultation, Patient> patient;
    public static volatile SingularAttribute<Consultation, String> repos;
    public static volatile SingularAttribute<Consultation, String> heureCons;
    public static volatile SingularAttribute<Consultation, String> diagCons;
    public static volatile SingularAttribute<Consultation, Date> dateCons;
    public static volatile SingularAttribute<Consultation, String> traitementCons;

}