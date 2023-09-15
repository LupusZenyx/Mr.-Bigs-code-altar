class Kunde {
    private String name;
    private String vorname;
    private Adresse adresse;
    private boolean gutschrift;

    public Kunde(String name, String vorname, Adresse adresse) {
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.gutschrift = false;
    }

    public void setGutschrift(boolean gutschrift) {
        this.gutschrift = gutschrift;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGutschrift() {
        return gutschrift ? "Ja" : "Nein";
    }
}
