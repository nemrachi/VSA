package entities;

import entities.Kniha;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-03-12T14:27:41")
@StaticMetamodel(Osoba.class)
public class Osoba_ { 

    public static volatile ListAttribute<Osoba, Kniha> dielo;
    public static volatile SingularAttribute<Osoba, String> meno;
    public static volatile SingularAttribute<Osoba, Long> id;

}