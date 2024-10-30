package hotelreservationsystem.service;

import hotelreservationsystem.entity.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
    Customer getCustomer(int customerId);
    List<Customer> getAllCustomers();
}
