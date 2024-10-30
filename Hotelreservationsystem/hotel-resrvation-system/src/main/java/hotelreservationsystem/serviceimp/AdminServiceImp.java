package hotelreservationsystem.serviceimp;

import hotelreservationsystem.dao.AdminDao;
import hotelreservationsystem.daoimp.AdminDaoImp;
import hotelreservationsystem.entity.Admin;
import hotelreservationsystem.service.AdminService;

public class AdminServiceImp implements AdminService {
    private final AdminDao adminDao = new AdminDaoImp();

    @Override
    public Admin getAdmin(int adminId) {
        return adminDao.getAdmin(adminId);
    }

    @Override
    public boolean validateAdmin(int adminId, String password) {
        Admin admin = adminDao.getAdmin(adminId);
        return admin != null && admin.getPassword().equals(password);
    }
}