package A03_Collections.B06_Relations;

import java.util.ArrayList;
import java.util.List;

public class Main_Relations {
    public static void main(String[] args) {

        List<Owner> owners_list = new ArrayList<>();
        List<Car> cars_list = new ArrayList<>();

        Car car1 = new Car();
        car1.setId(1);
        car1.setBrand("Ford");
        car1.setModel("Focus");

        Owner owner1 = new Owner();
        owner1.setId(1);
        owner1.setName("John");
        owner1.setSurname("Doe");

        Owner owner2 = new Owner();
        owner2.setId(2);
        owner2.setName("Jane");
        owner2.setSurname("Doe");

        owners_list.add(owner1);
        owners_list.add(owner2);

        car1.setOwner(owners_list);

        cars_list.add(car1);

        owner1.setCars(cars_list);
        owner2.setCars(cars_list);

        System.out.println("Car1:");
        System.out.println(car1);
        System.out.println("Owner1:");
        System.out.println(owner1);
        System.out.println("Owner2:");
        System.out.println(owner2);

        System.out.println("Owners of " + car1.getBrand() + " " + car1.getModel() + ":");
        car1.showOwners();

        System.out.println("Cars of " + owner1.getName() + ":");
        owner1.showCars();
        System.out.println("Cars of " + owner2.getName() + ":");
        owner2.showCars();


    }
}
