package hotelreservationsystem;

import hotelreservationsystem.entity.Room;
import hotelreservationsystem.entity.Customer;
import hotelreservationsystem.service.*;
import hotelreservationsystem.serviceimp.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String LINE_SEPARATOR = 
        "\033[1;34m==============================================\033[0m";  // Changed to blue

    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImp();
        ReceptionistService receptionistService = new ReceptionistServiceImp();
        CustomerService customerService = new CustomerServiceImp();
        RoomService roomService = new RoomServiceImp();

        System.out.println("\033[1;34mWelcome to the Hotel Reservation System!\033[0m");  // Changed to blue
        System.out.println(LINE_SEPARATOR);

        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "A" -> handleAdminLogin(adminService, roomService);
                case "B" -> handleReceptionistLogin(receptionistService, roomService);
                case "C" -> handleCustomerBooking(customerService, roomService);
                case "D" -> {
                    System.out.println("\033[1;32mThank you for using the Hotel Reservation System!\033[0m");
                    exit = true;
                }
                default -> System.out.println("\033[1;31mInvalid option! Please try again.\033[0m");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\n\033[1;33mSelect Option:\033[0m");
        System.out.println("A) Admin\nB) Receptionist\nC) Customer\nD) Exit");
        System.out.print("\033[1;36mEnter your choice: \033[0m");  // Changed to cyan
    }

    private static void handleAdminLogin(AdminService adminService, RoomService roomService) {
        System.out.print("\033[1;36mEnter Admin ID: \033[0m");  // Changed to cyan
        int adminId = getIntInput();
        System.out.print("\033[1;36mEnter Password: \033[0m");  // Changed to cyan
        String password = scanner.nextLine();

        if (adminService.validateAdmin(adminId, password)) {
            boolean back = false;
            while (!back) {
                displayAdminMenu();
                int option = getIntInput();
                switch (option) {
                    case 1 -> System.out.println("\033[1;32mAccessing Receptionist System...\033[0m");
                    case 2 -> displayAvailableRooms(roomService);
                    case 3 -> addRoom(roomService);
                    case 4 -> back = true;
                    default -> System.out.println("\033[1;31mInvalid option! Please try again.\033[0m");
                }
            }
        } else {
            System.out.println("\033[1;31mInvalid Admin Credentials!\033[0m");
        }
    }

    private static void displayAdminMenu() {
        System.out.println("\n\033[1;33mAdmin Options:\033[0m");
        System.out.println("1) Access Receptionist");
        System.out.println("2) Check Room Availability");
        System.out.println("3) Add Room");
        System.out.println("4) Back");
        System.out.print("\033[1;36mSelect an option: \033[0m");  // Changed to cyan
    }

    private static void addRoom(RoomService roomService) {
        System.out.print("\033[1;36mEnter Room Type: \033[0m");  // Changed to cyan
        String roomType = scanner.nextLine();
        System.out.print("\033[1;36mEnter Room Price: \033[0m");  // Changed to cyan
        double price = scanner.nextDouble();
        scanner.nextLine(); // Clear the buffer

        Room room = new Room(generateRoomId(), roomType, price, true);
        roomService.addRoom(room);
        System.out.println("\033[1;32mRoom added successfully!\033[0m");
    }

    private static void handleReceptionistLogin(ReceptionistService receptionistService, RoomService roomService) {
        System.out.print("\033[1;36mEnter Receptionist ID: \033[0m");  // Changed to cyan
        int receptionistId = getIntInput();
        System.out.print("\033[1;36mEnter Password: \033[0m");  // Changed to cyan
        String password = scanner.nextLine();

        if (receptionistService.validateReceptionist(receptionistId, password)) {
            boolean back = false;
            while (!back) {
                displayReceptionistMenu();
                int option = getIntInput();
                switch (option) {
                    case 1 -> displayAvailableRooms(roomService);
                    case 2 -> System.out.println("Feature: View Customer Details");
                    case 3 -> back = true;
                    default -> System.out.println("\033[1;31mInvalid option! Please try again.\033[0m");
                }
            }
        } else {
            System.out.println("\033[1;31mInvalid Receptionist Credentials!\033[0m");
        }
    }

    private static void displayReceptionistMenu() {
        System.out.println("\n\033[1;33mReceptionist Options:\033[0m");
        System.out.println("1) Check Room Availability");
        System.out.println("2) View Customer Details");
        System.out.println("3) Back");
        System.out.print("\033[1;36mSelect an option: \033[0m");  // Changed to cyan
    }

    private static void handleCustomerBooking(CustomerService customerService, RoomService roomService) {
        System.out.print("\033[1;36mEnter Your Name: \033[0m");  // Changed to cyan
        String name = scanner.nextLine();
        System.out.print("\033[1;36mEnter Your Address: \033[0m");  // Changed to cyan
        String address = scanner.nextLine();
        System.out.print("\033[1;36mEnter Your Phone Number: \033[0m");  // Changed to cyan
        String phoneNumber = scanner.nextLine();

        String roomType = selectRoomType();
        if (roomType == null) return;

        System.out.print("\033[1;36mEnter Check-in Date and Time (yyyy-MM-dd HH:mm): \033[0m");  // Changed to cyan
        String checkIn = scanner.nextLine();
        System.out.print("\033[1;36mEnter Check-out Date and Time (yyyy-MM-dd HH:mm): \033[0m");  // Changed to cyan
        String checkOut = scanner.nextLine();

        String paymentMode = selectPaymentMode();
        if (paymentMode == null) return;

        Customer customer = new Customer(name, address, phoneNumber, roomType, checkIn, checkOut, paymentMode);
        customerService.addCustomer(customer);

        System.out.println("\033[1;32mReservation Successful! Your Room ID is: " + generateRoomId() + "\033[0m");
    }

    private static String selectRoomType() {
        System.out.println("\n\033[1;33mSelect Room Type:\033[0m");
        System.out.println("1) Suite\n2) Deluxe\n3) AC Ordinary\n4) Non-AC Ordinary");
        System.out.print("\033[1;36mEnter your choice: \033[0m");  // Changed to cyan

        int choice = getIntInput();
        return switch (choice) {
            case 1 -> "Suite";
            case 2 -> "Deluxe";
            case 3 -> "AC Ordinary";
            case 4 -> "Non-AC Ordinary";
            default -> {
                System.out.println("\033[1;31mInvalid Room Type! Please try again.\033[0m");
                yield null;
            }
        };
    }

    private static String selectPaymentMode() {
        System.out.println("\n\033[1;33mSelect Payment Mode:\033[0m");
        System.out.println("1) Debit\n2) Credit\n3) UPI");
        System.out.print("\033[1;36mEnter your choice: \033[0m");  // Changed to cyan

        int choice = getIntInput();
        return switch (choice) {
            case 1 -> "Debit";
            case 2 -> "Credit";
            case 3 -> "UPI";
            default -> {
                System.out.println("\033[1;31mInvalid Payment Mode! Please try again.\033[0m");
                yield null;
            }
        };
    }

    private static void displayAvailableRooms(RoomService roomService) {
        List<Room> rooms = roomService.getAvailableRooms();
        System.out.println("\n\033[1;33mAvailable Rooms:\033[0m");
        for (Room room : rooms) {
            System.out.println(room.getRoomId() + " - " + room.getRoomType() + " : ₹" + room.getPrice());
        }
    }

    private static String generateRoomId() {
        return "RM" + (1000 + new Random().nextInt(9000));
    }

    private static int getIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("\033[1;31mInvalid input! Please enter a number: \033[0m");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        return input;
    }
}
