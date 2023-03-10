package vsa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import vsa.Dostupnost;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-03-09T21:40:32")
@StaticMetamodel(Kniha.class)
public class Kniha_ { 

    public static volatile SingularAttribute<Kniha, String> nazov;
    public static volatile SingularAttribute<Kniha, Dostupnost> dostupnost;
    public static volatile SingularAttribute<Kniha, Double> cena;
    public static volatile SingularAttribute<Kniha, String> autor;

}