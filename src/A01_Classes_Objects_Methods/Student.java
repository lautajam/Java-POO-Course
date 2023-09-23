package A01_Classes_Objects_Methods;

public class Student {

    // Attributes
    static int lastId = 0;
    int id;
    String name;
    String surname;

    // Constructors
    public Student() {
        this.id = ++lastId;
    }

    public Student(String name, String surname) {
        this.id = ++lastId;
        this.name = name;
        this.surname = surname;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Methods
    public void sayName(){
        System.out.println("Hi! My name is " + this.name + " " + this.surname);
    }

    public void knowGrade(double grade){
        if (grade >= 6) {
            System.out.println("I'm approved");
        } else {
            System.out.println("I'm not approved");
        }
    }
}
