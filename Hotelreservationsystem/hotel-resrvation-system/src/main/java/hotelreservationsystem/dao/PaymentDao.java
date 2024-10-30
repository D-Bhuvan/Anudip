package hotelreservationsystem.dao;

import hotelreservationsystem.entity.Payment;

public interface PaymentDao {
    void addPayment(Payment payment);
    Payment getPayment(int paymentId);
}