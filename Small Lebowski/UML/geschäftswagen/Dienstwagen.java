class Dienstwagen {
    private String kennzeichen;
    private String hersteller;
    private String farbe;
    private Mitarbeiter seinFahrer;

    public Dienstwagen(String kennzeichen, String hersteller, String farbe) {
        this.kennzeichen = kennzeichen;
        this.hersteller = hersteller;
        this.farbe = farbe;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }
    public String getHersteller(){
        return hersteller;
    }
    public String getFarbe(){
        return farbe;
    }

    public Mitarbeiter getSeinFahrer() {
        return seinFahrer;
    }

    public void setSeinFahrer(Mitarbeiter mitarbeiter) {
        this.seinFahrer = mitarbeiter;
    }
}
