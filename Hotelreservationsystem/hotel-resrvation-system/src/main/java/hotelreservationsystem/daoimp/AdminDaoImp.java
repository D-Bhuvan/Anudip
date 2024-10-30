package hotelreservationsystem.daoimp;

import hotelreservationsystem.dao.AdminDao;
import hotelreservationsystem.entity.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AdminDaoImp implements AdminDao {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public Admin getAdmin(int adminId) {
        Session session = factory.openSession();
        Admin admin = session.get(Admin.class, adminId);
        session.close();
        return admin;
    }
}