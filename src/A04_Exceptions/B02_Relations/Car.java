package A04_Exceptions.B02_Relations;

import java.util.List;

public class Car {

    // Attributes
    private int id;
    private String brand;
    private String model;
    private List<Owner> owner;

    // Constructors
    public Car() {
    }

    public Car(String brand, String model, int id, List<Owner> owner) {
        this.brand = brand;
        this.model = model;
        this.id = id;
        this.owner = owner;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Owner> getOwner() {
        return owner;
    }

    public void setOwner(List<Owner> owner) {
        this.owner = owner;
    }

    // Methods
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }

    // Print all owners from a car
    public void showOwners() {
        if (owner != null) {
            for (Owner owner : this.owner) {
                System.out.println(owner);
            }
        }
    }
}
