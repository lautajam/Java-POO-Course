package Integrative_Exercises.E03_Plants.Plans_Types;

public class Shrub extends Plants{

    // Attributes
    private double widthShrub;
    private boolean isDomestic;
    private String varietyShrub;
    private String leavesColor;
    private boolean hasPruning;

    // Constructors
    public Shrub() {
    }

    public Shrub(String name, int stem_height, boolean hasLeaves, String ideal_climate, double widthShrub,
                 boolean isDomestic, String varietyShrub, String leavesColor, boolean hasPruning) {
        super(name, stem_height, hasLeaves, ideal_climate);
        this.widthShrub = widthShrub;
        this.isDomestic = isDomestic;
        this.varietyShrub = varietyShrub;
        this.leavesColor = leavesColor;
        this.hasPruning = hasPruning;
    }

    // Getters and Setters
    public double getWidthShrub() {
        return widthShrub;
    }

    public void setWidthShrub(double widthShrub) {
        this.widthShrub = widthShrub;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getVarietyShrub() {
        return varietyShrub;
    }

    public void setVarietyShrub(String varietyShrub) {
        this.varietyShrub = varietyShrub;
    }

    public String getLeavesColor() {
        return leavesColor;
    }

    public void setLeavesColor(String leavesColor) {
        this.leavesColor = leavesColor;
    }

    public boolean isHasPruning() {
        return hasPruning;
    }

    public void setHasPruning(boolean hasPruning) {
        this.hasPruning = hasPruning;
    }

    // Methods
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a shrub");
    }

    @Override
    public String toString() {
        return "Shrub{" + super.toString() +
                ", widthShrub=" + widthShrub +
                ", isDomestic=" + isDomestic +
                ", varietyShrub='" + varietyShrub + '\'' +
                ", leavesColor='" + leavesColor + '\'' +
                ", hasPruning=" + hasPruning +
                '}';
    }

}
