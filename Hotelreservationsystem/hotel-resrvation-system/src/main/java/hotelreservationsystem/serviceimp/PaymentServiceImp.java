package hotelreservationsystem.serviceimp;

import hotelreservationsystem.dao.PaymentDao;
import hotelreservationsystem.daoimp.PaymentDaoImp;
import hotelreservationsystem.entity.Payment;
import hotelreservationsystem.service.PaymentService;

public class PaymentServiceImp implements PaymentService {
    private final PaymentDao paymentDao = new PaymentDaoImp();

    @Override
    public void addPayment(Payment payment) {
        paymentDao.addPayment(payment);
    }

    @Override
    public Payment getPayment(int paymentId) {
        return paymentDao.getPayment(paymentId);
    }
}