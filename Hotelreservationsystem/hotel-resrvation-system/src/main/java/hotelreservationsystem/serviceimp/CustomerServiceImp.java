package hotelreservationsystem.serviceimp;

import hotelreservationsystem.dao.CustomerDao;
import hotelreservationsystem.daoimp.CustomerDaoImp;
import hotelreservationsystem.entity.Customer;
import hotelreservationsystem.service.CustomerService;

import java.util.List;

public class CustomerServiceImp implements CustomerService {
    private final CustomerDao customerDao = new CustomerDaoImp();

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(int customerId) {
        customerDao.deleteCustomer(customerId);
    }

    @Override
    public Customer getCustomer(int customerId) {
        return customerDao.getCustomer(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }
}