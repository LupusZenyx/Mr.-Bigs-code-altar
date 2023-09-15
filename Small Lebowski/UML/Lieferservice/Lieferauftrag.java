class Lieferauftrag {
    private LocalDateTime start;
    private LocalDateTime ausgeliefert;
    private LocalDateTime ende;

    public Lieferauftrag(Bestellung bestellung, Fahrer fahrer, Fahrzeug fahrzeug) {
        this.start = LocalDateTime.now();
    }
}
