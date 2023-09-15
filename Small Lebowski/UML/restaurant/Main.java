package Gross.UML.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        // Beispielverwendung der Klassen
        Restaurant hufgoldRestaurant = new Restaurant("Hüftgold");

        Room room1 = new Room(1, false);
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 6);
        room1.addTable(table1);
        room1.addTable(table2);
        hufgoldRestaurant.addRoom(room1);

        Room room2 = new Room(2, true);
        Table table3 = new Table(1, 2);
        room2.addTable(table3);
        hufgoldRestaurant.addRoom(room2);

        // Ausgabe der vorhandenen Räume und Tische
        List<Room> rooms = hufgoldRestaurant.getRooms();
        for (Room room : rooms) {
            System.out.println("Raum: " + room.getNumber() + ", Rauchen erlaubt: " + room.isSmokingAllowed());
            List<Table> tables = room.getTables();
            for (Table table : tables) {
                System.out.println("Tisch: " + table.getNumber() + ", Anzahl Stühle: " + table.getNumberOfChairs());
            }
            System.out.println();
        }
    }
}
