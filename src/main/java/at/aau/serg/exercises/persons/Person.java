package at.aau.serg.exercises.persons;

public class Person {
    private static int nextId = 0;
    private int id;
    private String vorname,nachname;
    private Integer alter;
    private String beruf;
    private String bevorzugteProgrammierSprache;
    private String ide;
    private boolean datenbanken;
    private String feld;
    private String bevorzugtesTestFramework;
    private final String entwickler = "Entwickler";
    private final String architekt = "Architekt";
    private final String tester = "Tester";

    public Person(String vorname, String nachname, Integer alter, String beruf, String bevorzugteProgrammierSprache, String ide, boolean datenbanken, String feld, String bevorzugtesTestFramework) {
        this.id = nextId++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.beruf = beruf;
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
        this.ide = ide;
        this.datenbanken = datenbanken;
        this.feld = feld;
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }

    public String getJobBeschreibung() throws Exception{
        switch(beruf) {
            case entwickler: return "Entwickelt Code.";
            case architekt: return "Designed die Architektur des Projekts.";
            case tester: return "Testet Code.";
            default: throw new Exception("Job not Found!");
        }
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public String getBevorzugteProgrammierSprache() {
        return bevorzugteProgrammierSprache;
    }

    public void setBevorzugteProgrammierSprache(String bevorzugteProgrammierSprache) {
        this.bevorzugteProgrammierSprache = bevorzugteProgrammierSprache;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public boolean isDatenbanken() {
        return datenbanken;
    }

    public void setDatenbanken(boolean datenbanken) {
        this.datenbanken = datenbanken;
    }

    public String getFeld() {
        return feld;
    }

    public void setFeld(String feld) {
        this.feld = feld;
    }

    public String getBevorzugtesTestFramework() {
        return bevorzugtesTestFramework;
    }

    public void setBevorzugtesTestFramework(String bevorzugtesTestFramework) {
        this.bevorzugtesTestFramework = bevorzugtesTestFramework;
    }
}
