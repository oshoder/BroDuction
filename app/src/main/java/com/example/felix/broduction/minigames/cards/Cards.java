package com.example.felix.broduction.minigames.cards;

public class Cards {

    private String coulor;
    private int value = 2;

    /**
     * ertstellt eine Karte mit Farbe und Wert
     * @param coulour
     * @param value
     */
    public Cards(String coulour, int value){
        this.coulor = coulour;
        this.value = value;
    }

    /**
     * gibt die farbe der Karte zurück
     * @return
     */
    public String getCoulor(){
        return coulor;
    }

    /**
     * gibt den Wert der kart zurück
     * Bube = 11, Dame = 12, König = 13, Ass = 14
     * @return
     */
    public int getValue(){
        return value;
    }


}
