package hotelreservationsystem.serviceimp;

import hotelreservationsystem.dao.ReceptionistDao;
import hotelreservationsystem.daoimp.ReceptionistDaoImp;
import hotelreservationsystem.entity.Receptionist;
import hotelreservationsystem.service.ReceptionistService;

public class ReceptionistServiceImp implements ReceptionistService {
    private final ReceptionistDao receptionistDao = new ReceptionistDaoImp();

    @Override
    public Receptionist getReceptionist(int receptionistId) {
        return receptionistDao.getReceptionist(receptionistId);
    }

    @Override
    public boolean validateReceptionist(int receptionistId, String password) {
        Receptionist receptionist = receptionistDao.getReceptionist(receptionistId);
        return receptionist != null && receptionist.getPassword().equals(password);
    }
}