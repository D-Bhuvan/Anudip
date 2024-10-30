package hotelreservationsystem.daoimp;

import hotelreservationsystem.dao.ReceptionistDao;
import hotelreservationsystem.entity.Receptionist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReceptionistDaoImp implements ReceptionistDao {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public Receptionist getReceptionist(int receptionistId) {
        Session session = factory.openSession();
        Receptionist receptionist = session.get(Receptionist.class, receptionistId);
        session.close();
        return receptionist;
    }
}