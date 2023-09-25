package Integrative_Exercises.E03_Plants.Plans_Types;

public class Tree extends Plants{

    // Attributes
    private String variety;
    private String trunk_type;
    private double trunk_radius;
    private String color;
    private String type_leaves;

    // Constructors
    public Tree() {
    }

    public Tree(String name, int stem_height, boolean hasLeaves, String ideal_climate, String variety,
                String trunk_type, double trunk_radius, String color, String type_leaves) {
        super(name, stem_height, hasLeaves, ideal_climate);
        this.variety = variety;
        this.trunk_type = trunk_type;
        this.trunk_radius = trunk_radius;
        this.color = color;
        this.type_leaves = type_leaves;
    }

    // Getters and Setters
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTrunk_type() {
        return trunk_type;
    }

    public void setTrunk_type(String trunk_type) {
        this.trunk_type = trunk_type;
    }

    public double getTrunk_radius() {
        return trunk_radius;
    }

    public void setTrunk_radius(double trunk_radius) {
        this.trunk_radius = trunk_radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType_leaves() {
        return type_leaves;
    }

    public void setType_leaves(String type_leaves) {
        this.type_leaves = type_leaves;
    }

    //Methods
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a tree");
    }

    @Override
    public String toString() {
        return "Tree{" + super.toString() +
                ", variety='" + variety + '\'' +
                ", trunk_type='" + trunk_type + '\'' +
                ", trunk_radius=" + trunk_radius +
                ", color='" + color + '\'' +
                ", type_leaves='" + type_leaves + '\'' +
                '}';
    }
}
