package entities;

import entities.Kniha;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-03-11T13:21:25")
@StaticMetamodel(Firma.class)
public class Firma_ { 

    public static volatile ListAttribute<Firma, Kniha> publikacie;
    public static volatile SingularAttribute<Firma, String> adresa;
    public static volatile SingularAttribute<Firma, Long> id;

}