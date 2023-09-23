package A02_OOP_Properties.B01_Inheritance_Polymorphism_Encapsulation;

public class Main_OOP_Properties_In_Po_En {
    public static void main(String[] args) {

        Person[] person_list = new Person[4];

        person_list[0] = new Person(1, "John", "Doe", "123 Main St",
                                    "123456789", "555-555-5555");
        person_list[1] = new Employee(2, "Jane", "Smith", "456 Elm St",
                                      "987654321", "555-555-5556", 101, "Manager", 60000.0);
        person_list[2] = new Consultant(3, "Alice", "Johnson", "789 Oak St",
                                        "234567890", "555-555-5557", "ConsulCo", 42);
        person_list[3] = new Boss(4, "Bob", "Williams", "101 Pine St",
                                  "345678901", "555-555-5558", 201, "HR");

        System.out.println(person_list[1].getName() + " is a " + person_list[1].getClass() +
                            "this position is: " + ((Employee) person_list[1]).getPosition());
    }
}
