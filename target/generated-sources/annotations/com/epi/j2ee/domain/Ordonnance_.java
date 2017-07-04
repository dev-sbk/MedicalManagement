package com.epi.j2ee.domain;

import com.epi.j2ee.domain.Consultation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T07:53:53")
@StaticMetamodel(Ordonnance.class)
public class Ordonnance_ { 

    public static volatile SingularAttribute<Ordonnance, Integer> idOrd;
    public static volatile SingularAttribute<Ordonnance, Date> dateOrd;
    public static volatile SingularAttribute<Ordonnance, String> description;
    public static volatile SingularAttribute<Ordonnance, Consultation> consultation;

}