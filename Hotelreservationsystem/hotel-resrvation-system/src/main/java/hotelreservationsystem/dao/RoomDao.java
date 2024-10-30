package hotelreservationsystem.dao;

import hotelreservationsystem.entity.Room;

import java.util.List;

public interface RoomDao {
    void addRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(int roomId);
    Room getRoom(int roomId);
    List<Room> getAllRooms();
    List<Room> getAvailableRooms();
}
