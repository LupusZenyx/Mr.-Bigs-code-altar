class Fahrzeug {
    private String kennzeichen;
    private String typ;
    private boolean frei;

    public Fahrzeug(String typ, String kennzeichen) {
        this.typ = typ;
        this.kennzeichen = kennzeichen;
        this.frei = true;
    }
}
