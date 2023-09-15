class Fahrer {
    private static int autowert = 0;
    private int fahrernr;
    private String vorname;
    private String nachname;
    private String rfidKennung;
    private char fuehrerscheinklasse;
    private boolean arbeitet;
    private boolean aufTour;

    public Fahrer(String vorname, String nachname, String rfidKennung, char fuehrerscheinklasse) {
        this.fahrernr = ++autowert;
        this.vorname = vorname;
        this.nachname = nachname;
        this.rfidKennung = rfidKennung;
        this.fuehrerscheinklasse = fuehrerscheinklasse;
        this.arbeitet = true;
        this.aufTour = false;
    }
}
