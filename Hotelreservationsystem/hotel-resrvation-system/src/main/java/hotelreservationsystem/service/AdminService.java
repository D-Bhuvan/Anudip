package hotelreservationsystem.service;

import hotelreservationsystem.entity.Admin;

public interface AdminService {
    Admin getAdmin(int adminId);
    boolean validateAdmin(int adminId, String password);
}