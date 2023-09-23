package A02_OOP_Properties.B01_Inheritance_Polymorphism_Encapsulation;

public class Consultant extends Person {

    //Attributes (in addition to Person's attributes)
    private String consultant_name;
    private int consultant_number;

    //Constructors
    public Consultant() {
    }

    public Consultant(int id, String name, String surname, String address, String dni,
                      String telephone, String consultant_name, int consultant_number) {
        super(id, name, surname, address, dni, telephone);
        this.consultant_name = consultant_name;
        this.consultant_number = consultant_number;
    }

    //Getters and Setters
    public String getConsultant_name() {
        return consultant_name;
    }

    public void setConsultant_name(String consultant_name) {
        this.consultant_name = consultant_name;
    }

    public int getConsultant_number() {
        return consultant_number;
    }

    public void setConsultant_number(int consultant_number) {
        this.consultant_number = consultant_number;
    }
}
