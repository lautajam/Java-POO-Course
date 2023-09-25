package A04_Exceptions.B02_Relations;

import java.util.List;

public class Owner {

    // Attributes
    private int id;
    private String name;
    private String surname;
    private List<Car> cars;

    // Constructors
    public Owner() {
    }

    public Owner(String name, String surname, int id, List<Car> cars) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.cars = cars;
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

    public List<Car> getCars() {
        return cars;
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

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    // Methods
    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }

    // Print all cars from an owner
    public void showCars() {
        if (cars != null) {
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

}
