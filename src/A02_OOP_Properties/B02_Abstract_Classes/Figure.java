package A02_OOP_Properties.B02_Abstract_Classes;

public abstract class Figure {

    // Attributes
    protected double x_position;
    protected double y_position;

    // Constructors
    protected Figure() {
    }

    protected Figure(double x_position, double y_position) {
        this.x_position = x_position;
        this.y_position = y_position;
    }

    // Getters and Setters
    public double getX_position() {
        return x_position;
    }

    public void setX_position(double x_position) {
        this.x_position = x_position;
    }

    public double getY_position() {
        return y_position;
    }

    public void setY_position(double y_position) {
        this.y_position = y_position;
    }

    // Methods
    public abstract double calculate_area();
}
