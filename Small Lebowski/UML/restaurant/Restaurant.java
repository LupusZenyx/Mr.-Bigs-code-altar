package Gross.UML.restaurant;

class Restaurant {
    private String name;
    private List<Room> rooms;

    public Restaurant(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}