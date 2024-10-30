package hotelreservationsystem.service;

import hotelreservationsystem.entity.Room;

import java.util.List;

public interface RoomService {
    void addRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(int roomId);
    Room getRoom(int roomId);
    List<Room> getAllRooms();
    List<Room> getAvailableRooms();
}
