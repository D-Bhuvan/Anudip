package hotelreservationsystem.entity;

public class Room {
    private String roomId;
    private String roomType;
    private double price;
    private boolean available;

    public Room(String roomId, String roomType, double price, boolean available) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
    }

    // Getters and Setters
    public String getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
