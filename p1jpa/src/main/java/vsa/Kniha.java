/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsa;

import javax.persistence.*;

/**
 *
 * @author edu
 */
@Entity
public class Kniha {
    @Id
    private String nazov;
    private double cena;
    private String autor;
    private Dostupnost dostupnost;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Kniha{" + "nazov=" + nazov + ", cena=" + cena + '}';
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Enumerated(EnumType.STRING)
    public Dostupnost getDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(Dostupnost dostupnost) {
        this.dostupnost = dostupnost;
    }
}

