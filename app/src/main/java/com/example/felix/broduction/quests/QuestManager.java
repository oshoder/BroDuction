package com.example.felix.broduction.quests;

import java.util.ArrayList;
import java.util.List;

public class QuestManager {


     private ArrayList<Quest> quests;
     private int difficult;

    /**
     * Erstellt einen neuen QuestionManager.
     */
    public QuestManager() {
         quests = new ArrayList<Quest>();
         difficult = 1;
     }


    //<editor-fold desc="Initialisierung aller Fragen">
    /**
     * Initialisiert alle Fragen.
     */
    public void Init() {
        InitClassics();
        InitWorld();
     }

    /**
     * Initialisiert alle Classics.
     */
     private void InitClassics() {
         quests.add(new Quest("Trinke einen Shot. Ehrenmänner trinken eien mit.", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Verteile " + difficult + " Schlücke", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Verteile einen Shot", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Trinke " + difficult + " Schlücke", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Sage einen Trinkspruch und stoßt zusammen darauf an.", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Erzähle einen Witz, lacht keiner trinke " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Sage auf 5 verschiedenen Sprachen guten Tag. Kannst du das nicht, trinke " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Küss einen Gegenstand in diesem Raum oder Trinke " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Sage 15 Biermarken in 25 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Sage 10 Alkohole in 20 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Sage 13 Waffen des Mittelalters in 30 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Der der vorliest trinkt " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Der der vorliest verteilt " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("7 is heaven. Wer zuletzt den Arm hebt trinkt " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Stille post im Urzeigersinn. So viele Wörter wie am Ende richtig waren musst du trinken.", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Die Anderen stimmen darüber ab, ob du " + difficult + "trinken musst.", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Die Anderen stimmen darüber ab, ob du " + difficult + "verteilen darfst.", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Die Anderen stimmen darüber ab, ob du einen Shot trinken musst. Ehrenmänner trinken mit.", false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Sage eine Zungenbrecher den dir ein Mitspieler sagt 3 mal schnell und Fehlerfrei. Schaffst du das nicht trinke " + difficult + ", schaffst du es verteile "+ difficult+". Fällt niemanden ein Zungenbrecher ein ohne im Internet dannach zu suchen, trinken alle außer dir " + difficult, false, Quest.QuestTypes.Classic));
         quests.add(new Quest("Ich Sehe was, was du nicht siehst. Jeder sagt was nacheinander im Uhrzeigersinn. Wer zuerst errät, was du meinst, verteilt " + difficult, false, Quest.QuestTypes.Classic));
     }


    /**
     * Initialisiert alle Rund um die Welt Sachen.
     */
     private void InitWorld(){
         quests.add(new Quest("Sage 10 Hauptstädte in 20 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult , false, Quest.QuestTypes.World));
         quests.add(new Quest("Sage 13 Amerikanische Staaten in 25 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult, false, Quest.QuestTypes.World));
         quests.add(new Quest("Sage 10 Monarchen oder Diktatoren der Vergangenheit in 20 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult, false, Quest.QuestTypes.World));
         quests.add(new Quest("Spreche mit französichem Aktzent. Bei jedem verstoß trinke "+ difficult, true, Quest.QuestTypes.World));
         quests.add(new Quest("Spreche mit chinesischem Aktzent Bei jedem verstoß trinke "+ difficult, true, Quest.QuestTypes.World));
         quests.add(new Quest("Du darfst ab sofort kein deutsch mehr sprechen. Bei jedem verstoß trinke "+ difficult, true, Quest.QuestTypes.World));
         quests.add(new Quest("Sprecht alle wie Yoda. Bei jedem verstoß trinkt "+ difficult, true, Quest.QuestTypes.World));
         quests.add(new Quest("Sage 7 Bräuche in anderen Ländern in 40 Sekunden. Du hast Zeit dich vorzubereiten, bis einer deiner Sitznachbern einen Timer gestellt hat. Schaffst du es nicht trinke "+ difficult, false, Quest.QuestTypes.World));
         quests.add(new Quest("Sage alle Deutschen Bundesländer auf. Trinke soviel wie dir nicht einfallen. weißt du alle, verteile " + difficult, false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nSeit ihr mehr rechts oder links politisch orientiert. Die Minderheit muss so viele schlücke trinken, wie es stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nWürdet ihr eher für arme Menschen spenden die sonst sterben würden oder für Tiere? Die Minderheit muss so viele Schlücke trinken, wie es Stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nTrump oder Putin? Die Minderheit muss so viele schlücke trinken, wie es stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nWer ist schlimmer Nazis oder der Kucklucksklan? Die Minderheit muss so viele schlücke trinken, wie es stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nWürdet ihr wissen wollen, was der Staat alles vor euch geheim hält? Die Minderheit muss so viele schlücke trinken, wie es stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nGlaubt ihr es gab bereits Außerirdische auf der Erde? Die Minderheit muss so viele schlücke trinken, wie es stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Stimmt gleichzeitig ab.\nLieber Franzose oder Italiener sein? Die Minderheit muss so viele schlücke trinken, wie es stimmen für die Mehrheit gab.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Auf wie vielen Sprachen kannst du dich unterhalten? Verteile so viele Schlücke.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Sage Biermarken aus dem Ausland und weise sie dem richtigen Land zu. Für jedes richtige darfst du einen Schluck verteilen.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Sage Alkohole die Klischeehaft für ihr land sind. Für jeden den du benenen kannst darfst du einen Schluck verteilen.", false, Quest.QuestTypes.World));
         quests.add(new Quest("Sage Klischees über die Leute aus anderen Ländern. Für jedes was du nennst darfst du einen Schluck verteilen. Willst du nicht Rassistisch rüberkommen und sagst keins trinke "+ difficult, false, Quest.QuestTypes.World));
     }
    //</editor-fold>

    //<editor-fold desc="Getter und Setter">
    /**
     * Gibt die aktuelle Schwierigkeit zurück.
     * @return
     */
     public int getDifficult() {
         return difficult;
     }

    /**
     * Überschreibt die aktuelle Schwierigkeit.
     * @param difficult
     */
     public void setDifficult(int difficult) {
         this.difficult = difficult;
     }

    /**
     * Gibt ale Fragn zurück, die es gibt ;)
     * @return
     */
    public List<Quest> Quests () {
         return quests;
     }
    //</editor-fold>

}
