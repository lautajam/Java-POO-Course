package A03_Collections.B01_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main_ArrayList {
    public static void main(String[] args) {

        List<Person> people_list = new ArrayList<>();

        people_list.add(new Person(1, "John", 20));
        people_list.add(new Person(2, "Mary", 30));
        people_list.add(new Person(3, "Peter", 40));
        people_list.add(new Person(4, "Paul", 50));

        for ( Person person : people_list ) {
             System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
