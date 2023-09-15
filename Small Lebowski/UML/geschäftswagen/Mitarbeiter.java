class Mitarbeiter {
    private String name;
    private String vorname;
    private Dienstwagen seinAuto;

    public Mitarbeiter(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }
    public String getVorname(){
        return vorname;
    }
    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public Dienstwagen getSeinAuto() {
        return seinAuto;
    }

    public void setSeinAuto(Dienstwagen auto) {
        this.seinAuto = auto;
    }


}
