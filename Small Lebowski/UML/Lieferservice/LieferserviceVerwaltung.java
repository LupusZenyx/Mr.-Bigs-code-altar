class LieferserviceVerwaltung {
    private double gutschriftHoehe = 3;
    private List<Kunde> kundenListe = new ArrayList<>();

    public void ermittleGutschrift(Bestellung bestellung, Kunde kunde) {
        LocalDateTime bestellEingang = bestellung.getBestellEingang();
        LocalDateTime ausgeliefert = bestellung.getAusgeliefert();

        Duration duration = Duration.between(bestellEingang, ausgeliefert);
        long diff = Math.abs(duration.toMinutes());

        if (diff > 45) {
            kunde.setGutschrift(true);
        }
    }

    public void addKunde(Kunde kunde) {
        kundenListe.add(kunde);
    }

    public void berechneWartezeit(Bestellung bestellung, Kunde kunde) {
        LocalDateTime bestellEingang = bestellung.getBestellEingang();
        LocalDateTime ausgeliefert = bestellung.getAusgeliefert();

        Duration duration = Duration.between(bestellEingang, ausgeliefert);
        long diff = Math.abs(duration.toMinutes());

        System.out.println("Die Wartezeit für Bestellung " + bestellung.getBestellnr() + " beträgt " + diff + " Minuten.");
    }
}
