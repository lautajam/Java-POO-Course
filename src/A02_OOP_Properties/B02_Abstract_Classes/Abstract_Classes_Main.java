package A02_OOP_Properties.B02_Abstract_Classes;

public class Abstract_Classes_Main {
    public static void main(String[] args) {

        Circle circle = new Circle(7.0, 9.0, 2);

        System.out.println(circle.calculate_area());

        Square square = new Square(5.7, 2.0, 6);

        System.out.println(square.calculate_area());
    }
}
