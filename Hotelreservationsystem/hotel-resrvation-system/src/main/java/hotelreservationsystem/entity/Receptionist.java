package hotelreservationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "receptionists")
public class Receptionist {
    @Id
    private int receptionistId;

    private String password;

    // Constructors
    public Receptionist() {}

    public Receptionist(int receptionistId, String password) {
        this.receptionistId = receptionistId;
        this.password = password;
    }

    // Getters and Setters
    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}