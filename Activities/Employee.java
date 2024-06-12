package Activity;

public class Employee {

    int id;
    String name;

    Employee(int emId, String eName) {
        this.id = emId;
        this.name = eName;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(110, "xyz");
        Employee e2 = new Employee(120, "abc");

        e1.display();
        e2.display();
    }
}
