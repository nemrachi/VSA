package entities;

import entities.Firma;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-03-11T13:21:25")
@StaticMetamodel(Kniha.class)
public class Kniha_ { 

    public static volatile SingularAttribute<Kniha, String> nazov;
    public static volatile SingularAttribute<Kniha, Long> id;
    public static volatile SingularAttribute<Kniha, Firma> vydavatel;

}