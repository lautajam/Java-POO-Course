package A01_Classes_Objects_Methods;

public class Main_Classes_Objects_Methods {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Lautaro");
        student.setSurname("Merino");

        System.out.println(student.getId());
        student.sayName();

        Student student_2 = new Student("Juan", "Perez");

        System.out.println(student_2.getId());
        student_2.sayName();
    }
}
