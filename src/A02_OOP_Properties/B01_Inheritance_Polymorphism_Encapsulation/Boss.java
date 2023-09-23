package A02_OOP_Properties.B01_Inheritance_Polymorphism_Encapsulation;

public class Boss extends Person {

    //Attributes (in addition to Person's attributes)
    private int boss_id;
    private String boss_department;

    // Constructors
    public Boss() {
    }
    public Boss(int id, String name, String surname, String address,
                String dni, String telephone, int boss_id, String boss_department) {
        super(id, name, surname, address, dni, telephone);
        this.boss_id = boss_id;
        this.boss_department = boss_department;
    }

    // Getters and Setters
    public int getBoss_id() {
        return boss_id;
    }

    public void setBoss_id(int boss_id) {
        this.boss_id = boss_id;
    }

    public String getBoss_department() {
        return boss_department;
    }

    public void setBoss_department(String boss_department) {
        this.boss_department = boss_department;
    }
}
