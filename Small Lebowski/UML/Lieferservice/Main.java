public class Main {
    public static void main(String[] args) {
        LieferserviceVerwaltung lieferserviceVerwaltung = new LieferserviceVerwaltung();
        System.out.println("LieferserviceVerwaltung erzeugt.");

        Adresse a1 = new Adresse("Street 1", "12345", "City");
        Adresse a2 = new Adresse("Street 2", "67890", "City");
        System.out.println("Adressen erzeugt.");

        Kunde k1 = new Kunde("Kund1", "Eins", a1);
        Kunde k2 = new Kunde("Kund2", "Zwei", a2);
        System.out.println("Kunden erzeugt.");

        lieferserviceVerwaltung.addKunde(k1);
        lieferserviceVerwaltung.addKunde(k2);
        System.out.println("Kunden zu LieferserviceVerwaltung hinzugefügt.");

        Fahrer f1 = new Fahrer("Fahrer1", "Eins", "RFID1", 'B');
        System.out.println("Fahrer erstellt.");

        Fahrzeug fz1 = new Fahrzeug("E-Motorroller", "ABCDE");
        System.out.println("Fahrzeug erstellt.");

        Bestellung b1 = new Bestellung("1234567890", a1, 100);
        Bestellung b2 = new Bestellung("0987654321", a2, 200);
        System.out.println("Bestellungen erstellt.");

        Lieferauftrag la1 = new Lieferauftrag(b1, f1, fz1);
        Lieferauftrag la2 = new Lieferauftrag(b2, f1, fz1);
        System.out.println("Lieferaufträge erstellt.");

        lieferserviceVerwaltung.ermittleGutschrift(b1, k1);
        lieferserviceVerwaltung.ermittleGutschrift(b2, k2);
        System.out.println("ErmittleGutschrift Methode für alle Bestellungen.");

        System.out.println("Kunde " + k1.getName() + " " + k1.getVorname() + " hat Gutschrift: " + k1.getGutschrift());
        System.out.println("Kunde " + k2.getName() + " " + k2.getVorname() + " hat Gutschrift: " + k2.getGutschrift());
    }
}
