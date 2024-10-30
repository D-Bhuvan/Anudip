package hotelreservationsystem.daoimp;

import hotelreservationsystem.dao.CustomerDao;
import hotelreservationsystem.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDaoImp implements CustomerDao {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    @Override
    public void addCustomer(Customer customer) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void updateCustomer(Customer customer) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.update(customer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteCustomer(int customerId) {
        Session session = factory.openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class, customerId);
        if (customer != null) {
            session.delete(customer);
        }
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Customer getCustomer(int customerId) {
        Session session = factory.openSession();
        Customer customer = session.get(Customer.class, customerId);
        session.close();
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() {
        Session session = factory.openSession();
        List<Customer> customers = session.createQuery("from Customer", Customer.class).list();
        session.close();
        return customers;
    }
}