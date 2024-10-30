package hotelreservationsystem.dao;

import hotelreservationsystem.entity.Customer;

import java.util.List;

public interface CustomerDao {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
    Customer getCustomer(int customerId);
    List<Customer> getAllCustomers();
}