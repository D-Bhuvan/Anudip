package hotelreservationsystem.daoimp;

import hotelreservationsystem.dao.RoomDao;
import hotelreservationsystem.entity.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class RoomDaoImp implements RoomDao {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public void addRoom(Room room) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(room);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateRoom(Room room) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.update(room);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteRoom(int roomId) {
        Session session = factory.openSession();
        session.beginTransaction();
        Room room = session.get(Room.class, roomId);
        if (room != null) {
            session.delete(room);
        }
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Room getRoom(int roomId) {
        Session session = factory.openSession();
        Room room = session.get(Room.class, roomId);
        session.close();
        return room;
    }

    @Override
    public List<Room> getAllRooms() {
        Session session = factory.openSession();
        List<Room> rooms = session.createQuery("from Room", Room.class).list();
        session.close();
        return rooms;
    }

    @Override
    public List<Room> getAvailableRooms() {
        Session session = factory.openSession();
        List<Room> availableRooms = session.createQuery("from Room where isAvailable = true", Room.class).list();
        session.close();
        return availableRooms;
    }
}