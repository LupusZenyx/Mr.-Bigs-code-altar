class Room {
    private int number;
    private boolean smokingAllowed;
    private List<Table> tables;

    public Room(int number, boolean smokingAllowed) {
        this.number = number;
        this.smokingAllowed = smokingAllowed;
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void removeTable(Table table) {
        tables.remove(table);
    }

    public int getNumber() {
        return number;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public List<Table> getTables() {
        return tables;
    }
}