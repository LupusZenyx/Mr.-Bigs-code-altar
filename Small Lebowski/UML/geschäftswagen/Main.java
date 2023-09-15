class main {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Fesch", "Uwe");
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Fent", "Kurt");
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Heart", "Ralf");

        Dienstwagen auto1 = new Dienstwagen("UL - FE 1234", "audi", "blau");
        Dienstwagen auto2 = new Dienstwagen("BC - FE 4321", "BMW", "gelb");
        Dienstwagen auto3 = new Dienstwagen("S - HE 1122", "Mercedes", "rot");



        mitarbeiter1.setSeinAuto(auto1);
        auto1.setSeinFahrer(mitarbeiter1);

        mitarbeiter2.setSeinAuto(auto2);
        auto2.setSeinFahrer(mitarbeiter2);

        mitarbeiter3.setSeinAuto(auto3);
        auto3.setSeinFahrer(mitarbeiter3);


        System.out.println(auto1.getSeinFahrer().getName() + " " + auto1.getSeinFahrer().getVorname() + " " + auto1.getKennzeichen() + " " + auto1.getHersteller() + " " + auto1.getFarbe());
        System.out.println(auto2.getSeinFahrer().getName() + " " + auto2.getSeinFahrer().getVorname() + " " + auto2.getKennzeichen() + " " + auto2.getHersteller() + " " + auto2.getFarbe());
        System.out.println(auto3.getSeinFahrer().getName() + " " + auto3.getSeinFahrer().getVorname() + " " + auto3.getKennzeichen() + " " + auto3.getHersteller() + " " + auto3.getFarbe());

        System.out.println();

        System.out.println(auto1.getHersteller() + " " + auto1.getKennzeichen() + " " + auto1.getFarbe() + " " + auto1.getSeinFahrer().getName());
        System.out.println(auto2.getHersteller() + " " + auto2.getKennzeichen() + " " + auto2.getFarbe() + " " + auto2.getSeinFahrer().getName());
        System.out.println(auto3.getHersteller() + " " + auto3.getKennzeichen() + " " + auto3.getFarbe() + " " + auto3.getSeinFahrer().getName() );


    }
}
