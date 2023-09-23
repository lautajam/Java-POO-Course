package A02_OOP_Properties.B01_Inheritance_Polymorphism_Encapsulation;

public class Employee extends Person {

    //Attributes (in addition to Person's attributes)
    private int file_number;
    private String position;
    private double salary;

    // Constructors
    public Employee() {
    }

    public Employee(int id, String name, String surname, String address, String dni,
                    String telephone, int file_number, String position, double salary) {
        super(id, name, surname, address, dni, telephone);
        this.file_number = file_number;
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public int getFile_number() {
        return file_number;
    }

    public void setFile_number(int file_number) {
        this.file_number = file_number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
