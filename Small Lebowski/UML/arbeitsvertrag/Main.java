public class Main {
    
    public static void main(String[] args) {
        
        Arbeitsvertrag avMasterOfTheProject = new Arbeitsvertrag("Projektmanager", 4000);
        Mitarbeiter mitarbeiter = new Mitarbeiter("Ernst", "Voller", avMasterOfTheProject);

        System.out.println(avMasterOfTheProject);
        System.out.println(mitarbeiter);
        System.out.println(mitarbeiter.getVorname());
        System.out.println(mitarbeiter.getNachname());
        System.out.println(mitarbeiter.getArbeitsvertrag());

    }
}
