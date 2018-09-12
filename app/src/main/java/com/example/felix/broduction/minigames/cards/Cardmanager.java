package com.example.felix.broduction.minigames.cards;

import java.util.ArrayList;
import java.util.List;

public class Cardmanager {


    private ArrayList<Cards> cards;

    public Cardmanager(){
        cards = new ArrayList<Cards>();
    }

    //<editor-fold desc="Initialisierung aller Karten">
    /**
     * Initialisiert alle Karten.
     */
    public void Init() {
        InitPieks();
        InitCrosses();
        IniHearts();
        IniKaros();
    }

    /**
     * Initialisiert alle Pieks.
     */
    private void InitPieks() {
        cards.add(new Cards("piek", 2));
        cards.add(new Cards("piek", 3));
        cards.add(new Cards("piek", 4));
        cards.add(new Cards("piek", 5));
        cards.add(new Cards("piek", 6));
        cards.add(new Cards("piek", 7));
        cards.add(new Cards("piek", 8));
        cards.add(new Cards("piek", 9));
        cards.add(new Cards("piek", 10));
        cards.add(new Cards("piek", 11));
        cards.add(new Cards("piek", 12));
        cards.add(new Cards("piek", 13));
        cards.add(new Cards("piek", 14));
    }

    /**
     * Initialisiert alle Kreuze.
     */
    private void InitCrosses() {
        cards.add(new Cards("kreuz", 2));
        cards.add(new Cards("kreuz", 3));
        cards.add(new Cards("kreuz", 4));
        cards.add(new Cards("kreuz", 5));
        cards.add(new Cards("kreuz", 6));
        cards.add(new Cards("kreuz", 7));
        cards.add(new Cards("kreuz", 8));
        cards.add(new Cards("kreuz", 9));
        cards.add(new Cards("kreuz", 10));
        cards.add(new Cards("kreuz", 11));
        cards.add(new Cards("kreuz", 12));
        cards.add(new Cards("kreuz", 13));
        cards.add(new Cards("kreuz", 14));
    }

    /**
     * Initialisiert alle Herzen.
     */
    private void IniHearts() {
        cards.add(new Cards("herz", 2));
        cards.add(new Cards("herz", 3));
        cards.add(new Cards("herz", 4));
        cards.add(new Cards("herz", 5));
        cards.add(new Cards("herz", 6));
        cards.add(new Cards("herz", 7));
        cards.add(new Cards("herz", 8));
        cards.add(new Cards("herz", 9));
        cards.add(new Cards("herz", 10));
        cards.add(new Cards("herz", 11));
        cards.add(new Cards("herz", 12));
        cards.add(new Cards("herz", 13));
        cards.add(new Cards("herz", 14));
    }

    /**
     * Initialisiert alle karos.
     */
    private void IniKaros() {
        cards.add(new Cards("karo", 2));
        cards.add(new Cards("karo", 3));
        cards.add(new Cards("karo", 4));
        cards.add(new Cards("karo", 5));
        cards.add(new Cards("karo", 6));
        cards.add(new Cards("karo", 7));
        cards.add(new Cards("karo", 8));
        cards.add(new Cards("karo", 9));
        cards.add(new Cards("karo", 10));
        cards.add(new Cards("karo", 11));
        cards.add(new Cards("karo", 12));
        cards.add(new Cards("karo", 13));
        cards.add(new Cards("karo", 14));
    }
    //</editor-fold>

    /**
     * Gibt alle karten zurück, die es gibt ;)
     * @return
     */
    public List<Cards> Cards () {
        return cards;
    }
}
