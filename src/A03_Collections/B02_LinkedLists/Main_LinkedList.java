package A03_Collections.B02_LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main_LinkedList {
    public static void main(String[] args) {

        LinkedList<Person> people_list_linked = new LinkedList<>();
        people_list_linked.add(0, new Person(0, "John", 20));
        people_list_linked.add(1, new Person(1, "Adam", 23));
        people_list_linked.add(2, new Person(2, "Bob", 27));
        people_list_linked.add(3, new Person(3, "Carl", 31));

        ArrayList<Person> people_list_array = new ArrayList<>();
        people_list_array.add(new Person(1, "John", 20));
        people_list_array.add(new Person(2, "Mary", 30));
        people_list_array.add(new Person(3, "Peter", 40));
        people_list_array.add(new Person(4, "Paul", 50));


        // Remove Method

        System.out.println("REMOVE METHOD");

        for ( Person person : people_list_linked ) {
            System.out.println("ArrayList: " + person.getName());
        }

        for ( Person person : people_list_array ) {
            System.out.println("LinkedList: " + person.getName());
        }

        people_list_linked.removeIf(person -> person.getName().equalsIgnoreCase("Bob"));

        people_list_array.remove(0);

        System.out.println("------------------------------------");
        System.out.println("After removing Bob and John");
        System.out.println("------------------------------------");

        for ( Person person : people_list_array ) {
            System.out.println("ArrayList: " + person.getName());
        }

        for ( Person person : people_list_linked ) {
            System.out.println("LinkedList: " + person.getName());
        }

        System.out.println();

        // Size Method

        System.out.println("SIZE METHOD");

        System.out.println("ArrayList size: " + people_list_array.size());
        System.out.println("LinkedList size: " + people_list_linked.size());

        System.out.println();

        // Obtain first and last element

        System.out.println("OBTAIN FIRST AND LAST ELEMENT");

        System.out.println("First element of ArrayList: " + people_list_array.get(0).getName());
        System.out.println("Last element of ArrayList: " + people_list_array.get(people_list_array.size() - 1).getName());

        System.out.println("First element of LinkedList: " + people_list_linked.getFirst().getName());
        System.out.println("Last element of LinkedList: " + people_list_linked.getLast().getName());

        System.out.println();

        // Clear Method

        System.out.println("CLEAR METHOD");

        System.out.println("Clearing ArrayList and LinkedList");
        people_list_array.clear();
        System.out.println("...");
        people_list_linked.clear();
        System.out.println("Arraylist and linkedlist cleared");

        System.out.println();

        // isEmpty Method

        System.out.println("IS EMPTY METHOD");

        System.out.println("ArrayList is empty: " + people_list_array.isEmpty());
        System.out.println("LinkedList is empty: " + people_list_linked.isEmpty());
    }
}
