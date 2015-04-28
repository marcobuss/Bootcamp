package com.example.ista.bootcamp.model;

/**
 * Created by mbu on 28.04.15.
 */
public class Aufgabe {

    private int nummer = 1;
    private String beschreibung = "Aufgabe: ";

    public Aufgabe(int i) {
        beschreibung = beschreibung + i;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return beschreibung;
    }
}
