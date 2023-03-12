/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsa;

import entities.Kniha;
import entities.Osoba;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author edu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        create();
        read();
    }

    public static void create() {
        Osoba o1 = new Osoba();
        o1.setMeno("Hopcroft");
        Osoba o2 = new Osoba();
        o2.setMeno("Ullman");
        Osoba o3 = new Osoba();
        o3.setId(333L);
        o3.setMeno("Aho");
        Osoba huxley = new Osoba();
        huxley.setMeno("Huxley");
        Osoba orwell = new Osoba();
        orwell.setMeno("Orwell");

        Kniha k1 = new Kniha();
        k1.setNazov("Uvod do teorie automatov");
        Kniha k2 = new Kniha();
        k2.setNazov("Algoritmy a datove struktury");
        Kniha k3 = new Kniha();
        k3.setNazov("Brave new world");
        Kniha k4 = new Kniha();
        k4.setNazov("1984");
        
        k1.setAutor(new ArrayList<>());
        k1.getAutor().add(o1);
        k1.getAutor().add(o2);
        
        k2.setAutor(new ArrayList<>());
        k2.getAutor().add(o1);
        k2.getAutor().add(o2);
        k2.getAutor().add(o3);

        k3.setAutor(new ArrayList<>());
        k3.getAutor().add(huxley);

        k4.setAutor(new ArrayList<>());
        k4.getAutor().add(orwell);
        
        // pre DB nie je nutna 
        o1.setDielo(new ArrayList<>());
        o1.getDielo().add(k1);
        o1.getDielo().add(k2);

        o2.setDielo(new ArrayList<>());
        o2.getDielo().add(k1);
        o2.getDielo().add(k2);

        o3.setDielo(new ArrayList<>());
        o3.getDielo().add(k2);

        huxley.setDielo(new ArrayList<>());
        huxley.getDielo().add(k4);

        orwell.setDielo(new ArrayList<>());
        orwell.getDielo().add(k3);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vsaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(k1);
            em.persist(k2);
            em.persist(k3);
            em.persist(k4);
            em.persist(o1);
            em.persist(o2);
            em.persist(o3);
            em.persist(huxley);
            em.persist(orwell);
            em.getTransaction().commit();
            em.clear();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static void read() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vsaPU");
        EntityManager em = emf.createEntityManager();
        Osoba o = em.find(Osoba.class, 333L);
//        System.out.println(k.getNazov());
//        System.out.println(k.getAutor().size());
    }
    
    public static void createCv2() {
        Osoba o1 = new Osoba();
        o1.setMeno("Orwell");

        Osoba o2 = new Osoba();
        o2.setMeno("Huxley");

        Kniha k1 = new Kniha();
        k1.setNazov("1894");

        Kniha k2 = new Kniha();
        k2.setNazov("Brave new World");

        k1.setAutor(new ArrayList<>());
        k1.getAutor().add(o1);
        
        k2.setAutor(new ArrayList<>());
        k2.getAutor().add(o2);

        o1.setDielo(new ArrayList<>());
        o1.getDielo().add(k2);

        o2.setDielo(new ArrayList<>());
        o2.getDielo().add(k1);
        

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vsaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {

            em.persist(k1);
            em.persist(k2);
            em.persist(o1);
            em.persist(o2);

            em.getTransaction().commit();
            em.clear();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    

}