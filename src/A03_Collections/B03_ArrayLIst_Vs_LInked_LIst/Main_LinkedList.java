package A03_Collections.B03_ArrayLIst_Vs_LInked_LIst;

import java.util.LinkedList;
import java.util.List;

public class Main_LinkedList {
    public static void main(String[] args) {

        List<Person> people_list = new LinkedList<>();

        people_list.add(0, new Person(0, "John", 20));
        people_list.add(1, new Person(1, "Adam", 23));
        people_list.add(2, new Person(2, "Bob", 27));
        people_list.add(3, new Person(3, "Carl", 31));
        people_list.add(4, new Person(4, "David", 19));

        people_list.add(0, new Person(23, "Pedro", 21));


        for ( Person person : people_list ) {
             System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
