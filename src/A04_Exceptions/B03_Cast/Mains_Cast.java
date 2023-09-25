package A04_Exceptions.B03_Cast;

public class Mains_Cast {
    public static void main(String[] args) {

        double height = 1.56;
        int students_quantity = 30;
        String telephone = "112343534";
        int age = 18;

        System.out.println("Height (double): " + height);
        System.out.println("Students quantity (int): " + students_quantity);
        System.out.println("Telephone (String): " + telephone);
        System.out.println("Age (int): " + age);

        int height_int = (int) height; // Explicit cast
        double students_quantity_double = students_quantity; // Implicit cast
        int telephone_int = Integer.parseInt(telephone); // Explicit cast
        String age_string = String.valueOf(age); // Implicit cast

        System.out.println("--Cast--");

        System.out.println("Height (int): " + height_int);
        System.out.println("Students quantity (double): " + students_quantity_double);
        System.out.println("Telephone (int): " + telephone_int);
        System.out.println("Age (String): " + age_string);
    }
}
