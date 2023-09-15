class Bestellung {
    private static int autowert = 0;
    private int bestellnr;
    private LocalDateTime bestellEingang;
    private String telefon;
    private double gesamtpreis;

    public Bestellung(String telefon, Adresse lieferadresse, double gesamtpreis) {
        this.bestellnr = ++autowert;
        this.bestellEingang = LocalDateTime.now();
        this.telefon = telefon;
        this.gesamtpreis = gesamtpreis;
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public LocalDateTime getAusgeliefert() {
        return LocalDateTime.now();
    }

    public LocalDateTime getBestellEingang() {
        return bestellEingang;
    }
}
