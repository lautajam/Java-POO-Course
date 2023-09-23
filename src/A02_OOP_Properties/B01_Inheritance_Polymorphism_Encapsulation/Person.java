package A02_OOP_Properties.B01_Inheritance_Polymorphism_Encapsulation;

public class Person {


    //Attributes
    private int id;
    private String name;
    private String surname;
    private String address;
    private String dni;
    private String telephone;

    //Constructos

    public Person() {
    }

    public Person(int id, String name, String surname, String address, String dni, String telephone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.dni = dni;
        this.telephone = telephone;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
