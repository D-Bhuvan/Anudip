package hotelreservationsystem.service;

import hotelreservationsystem.entity.Receptionist;

public interface ReceptionistService {
    Receptionist getReceptionist(int receptionistId);
    boolean validateReceptionist(int receptionistId, String password);
}