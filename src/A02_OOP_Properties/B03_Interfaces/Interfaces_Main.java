package A02_OOP_Properties.B03_Interfaces;

import A02_OOP_Properties.B03_Interfaces.Circle;

public class Interfaces_Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        square.draw();

        Circle circle = new Circle(3.0);
        circle.draw();
        circle.rotate();
    }
}
