package hotelreservationsystem.daoimp;

import hotelreservationsystem.dao.PaymentDao;
import hotelreservationsystem.entity.Payment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PaymentDaoImp implements PaymentDao {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public void addPayment(Payment payment) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(payment);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Payment getPayment(int paymentId) {
        Session session = factory.openSession();
        Payment payment = session.get(Payment.class, paymentId);
        session.close();
        return payment;
    }
}