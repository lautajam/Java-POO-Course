package A02_OOP_Properties.B02_Abstract_Classes;

public class Circle extends Figure{

    // Constants
    protected final double PI = 3.14159265359;

    // Attributes
    private double radius;

    // Constructor
    public Circle(double v) {
    }

    public Circle(double x_position, double y_position, double radius) {
        super(x_position, y_position);
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
}
