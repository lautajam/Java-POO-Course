package A02_OOP_Properties.B02_Abstract_Classes;

public class Square extends Figure{

    // Attributes
    private double side;

    //Constructors
    public Square() {
    }

    public Square(double x_position, double y_position, double side) {
        super(x_position, y_position);
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
}
