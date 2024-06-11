
package Samplepackage;
import java.util.Scanner;
class User {
    String username, password, email, phone, pin;
    User(String username, String password, String email, String phone, String pin) {
        this.username = username; 
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.pin = pin;
    }
}
public class UserManager {
    private User[] users;
    private int userCount;

    public UserManager(int capacity) {
        users = new User[capacity];
        userCount = 0;
        addUser(new User("Maxmayfield", "madmax@18", "max18@mail.in", "999444000", "0000"));
        addUser(new User("Eleven", "el@11", "el11@mail.in", "999444111", "1212"));
        addUser(new User("Will", "will@45", "will45@mail.in", "994444000", "1234"));
        addUser(new User("Mike", "mike@12", "mike12@mail.in", "999933311", "0000"));
    }
    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
        } else {
            System.out.println("The Authentication is full.");
        }
    }
    public boolean authenticate(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].username.equals(username) && users[i].password.equals(password)) {
                return true;
            }
        }
        return false;
    }
    public boolean authenticateByEmail(String email, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].email.equals(email) && users[i].password.equals(password)) {
                return true;
            }
        }
        return false;
    }
    public boolean authenticateByPhone(String phone, String pin) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].phone.equals(phone) && users[i].pin.equals(pin)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        UserManager userManager = new UserManager(10);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select any one Choice:");
            System.out.println("1. Username and Password");
            System.out.println("2. Email and Password");
            System.out.println("3. Phone Number and PIN");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            boolean isAuthenticated = false;
            switch (choice)
            {
                case 1:
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    isAuthenticated = userManager.authenticate(username, password);
                    break;
                case 2:
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter password: ");
                    String emailPassword = sc.nextLine();
                    isAuthenticated = userManager.authenticateByEmail(email, emailPassword);
                    break;
                case 3:
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter PIN: ");
                    String pin = sc.nextLine();
                    isAuthenticated = userManager.authenticateByPhone(phone, pin);
                    break;
                case 4:
                    System.out.println("Exiting the Site. Please try again!");
                    return;
                default:
                    System.out.println("Invalid user choice. Please give correct user.");
                    continue;
            }
            if (isAuthenticated) 
            {
                System.out.println("Authentication successful!");
            } 
            else 
            {
                System.out.println("Authentication failed.");
            }
        }
    }
}
