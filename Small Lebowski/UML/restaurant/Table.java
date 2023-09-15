package Gross.UML.restaurant;

class Table {
    private int number;
    private int numberOfChairs;

    public Table(int number, int numberOfChairs) {
        this.number = number;
        this.numberOfChairs = numberOfChairs;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }
}
