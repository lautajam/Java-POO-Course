package A02_OOP_Properties.B03_Interfaces;

public class Square implements Figure, Drawable{

    // Attributes
    private double side;

    //Constructors
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    // Getters and Setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Methods
    @Override
    public double calculate_area() {
        return side * side;
    }

    @Override
    public void draw() {

        for (int i = 0; i < this.side; i++) {
            for (int j = 0; j < this.side; j++) {
                if (i == 0 || i == this.side - 1 || j == 0 || j == this.side - 1) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
