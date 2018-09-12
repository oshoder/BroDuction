package com.example.felix.broduction.quests;

public class Quest {


    private String context;
    private boolean delay = false;
    private QuestTypes type;

    /**
     * Alle Typen von Fragen.
     */
    public enum QuestTypes {
        Classic, Virus, World, When, Who, Drugs
    }


    /**
     * Ertellt eine neue Frage mit den gegebenen Eigenschaften.
     * @param context
     * @param delay
     * @param type
     */
    public Quest(String context, boolean delay, QuestTypes type) {
        this.delay = delay;
        this.context = context;
        this.type = type;
    }


    /**
     * Gibt den Context dieser Fage zurück.
     * @return
     */
    public String getContext() {
        return context;
    }

    /**
     * Gibt den Typ der Frage zurück.
     * @return
     */
    public QuestTypes getType() {
        return type;
    }

    /**
     * Gidt an, ob diese Frage einen Dekay-Effekt hat.
     * @return
     */
    public boolean getDelay() {
        return delay;
    }


}
