package hotelreservationsystem.serviceimp;

import hotelreservationsystem.entity.Room;
import hotelreservationsystem.service.RoomService;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImp implements RoomService {
    private List<Room> rooms; // In-memory storage for rooms

    public RoomServiceImp() {
        rooms = new ArrayList<>();
        // Adding some sample rooms (you can modify as per your needs)
        rooms.add(new Room("RM1001", "Suite", 10000, true));
        rooms.add(new Room("RM1002", "Deluxe", 5000, true));
        rooms.add(new Room("RM1003", "AC Ordinary", 2500, true));
        rooms.add(new Room("RM1004", "Non-AC Ordinary", 1500, true));
    }

    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public void updateRoom(Room room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomId().equals(room.getRoomId())) {
                rooms.set(i, room);
                return;
            }
        }
    }

    @Override
    public void deleteRoom(int roomId) {
        rooms.removeIf(room -> room.getRoomId().equals("RM" + roomId)); // Assuming roomId is part of roomId string
    }

    @Override
    public Room getRoom(int roomId) {
        for (Room room : rooms) {
            if (room.getRoomId().equals("RM" + roomId)) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAllRooms() {
        return new ArrayList<>(rooms);
    }

    @Override
    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    // Method to check if a room is available based on room ID
    public boolean isRoomAvailable(String roomId) {
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                return room.isAvailable();
            }
        }
        return false;
    }

    // Method to update room availability status
    public void updateRoomAvailability(String roomId, boolean availability) {
        for (Room room : rooms) {
            if (room.getRoomId().equals(roomId)) {
                room.setAvailable(availability);
                return;
            }
        }
    }
}
