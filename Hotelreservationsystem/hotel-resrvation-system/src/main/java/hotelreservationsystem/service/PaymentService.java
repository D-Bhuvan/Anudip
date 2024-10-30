package hotelreservationsystem.service;

import hotelreservationsystem.entity.Payment;

public interface PaymentService {
    void addPayment(Payment payment);
    Payment getPayment(int paymentId);
}