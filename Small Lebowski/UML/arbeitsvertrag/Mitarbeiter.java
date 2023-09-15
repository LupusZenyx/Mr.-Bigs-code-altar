public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private Arbeitsvertrag arbeitsvertrag;
    //Constructor for Mitarbeiter
    public Mitarbeiter(String vorname, String nachname, Arbeitsvertrag arbeitsvertrag) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.arbeitsvertrag = arbeitsvertrag;
    }
    //Setter/Getter of "vorname"
    public void setVorname(String vorname) {
        vorname = this.vorname;
    }

    public String getVorname() {
        return vorname;
    }
    //Setter/Getter of "nachname"
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }
    //Setter/Getter of "arbeitsvertrag"
    public void setArbeitsvertrag(Arbeitsvertrag arbeitsvertrag) {
        this.arbeitsvertrag = arbeitsvertrag;
    }

    public Arbeitsvertrag getArbeitsvertrag() {
        return arbeitsvertrag;
    }
}