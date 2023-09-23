package A02_OOP_Properties.B03_Interfaces;

public class Circle implements Figure, Drawable, Rotary {

    // Constants
    protected final double PI = 3.14159265359;

    // Attributes
    private double radius;

    // Constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Getters and Setters
    public double getArea() {
        return radius;
    }

    public void setArea(double radius) {
        this.radius = radius;
    }

    // Methods
    @Override
    public double calculate_area() {
        return PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        for (int i = (int) -this.radius; i <= this.radius; i++) {
            for (int j = (int) -this.radius; j <= this.radius; j++) {
                int distanciaAlCentro = (int) Math.sqrt(i * i + j * j);
                if (distanciaAlCentro <= this.radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void rotate() {
        System.out.println("Rotating...");
    }
}
