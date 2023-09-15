public class Arbeitsvertrag {
    private double gehalt;
    private String taetigkeit;
    //Constructor of "Arbeitsvertrag"
    public Arbeitsvertrag(String taetigkeit, double gehalt) {
        this.gehalt = gehalt;
        this.taetigkeit = taetigkeit;
    }
    //Setter/Getter of "gehalt"
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }
    //Setter/Getter of "taetigkeit"
    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    public String getTaetigkeit() {
        return taetigkeit;
    }
}
