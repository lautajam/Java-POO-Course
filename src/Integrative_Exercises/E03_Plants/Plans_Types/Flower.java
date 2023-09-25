package Integrative_Exercises.E03_Plants.Plans_Types;

public class Flower extends Plants{

    // Attributes
    private int average_num_petals;
    private String color_pistil;
    private String color_petals;
    private String flower_variety;
    private String blooming_season;

    // Constructors
    public Flower() {
    }

    public Flower(String name, int stem_height, boolean hasLeaves, String ideal_climate, int average_num_petals,
                  String color_pistil, String color_petals, String flower_variety, String blooming_season) {
        super(name, stem_height, hasLeaves, ideal_climate);
        this.average_num_petals = average_num_petals;
        this.color_pistil = color_pistil;
        this.color_petals = color_petals;
        this.flower_variety = flower_variety;
        this.blooming_season = blooming_season;
    }

    // Getters and Setters
    public int getAverage_num_petals() {
        return average_num_petals;
    }

    public void setAverage_num_petals(int average_num_petals) {
        this.average_num_petals = average_num_petals;
    }

    public String getColor_pistil() {
        return color_pistil;
    }

    public void setColor_pistil(String color_pistil) {
        this.color_pistil = color_pistil;
    }

    public String getColor_petals() {
        return color_petals;
    }

    public void setColor_petals(String color_petals) {
        this.color_petals = color_petals;
    }

    public String getFlower_variety() {
        return flower_variety;
    }

    public void setFlower_variety(String flower_variety) {
        this.flower_variety = flower_variety;
    }

    public String getBlooming_season() {
        return blooming_season;
    }

    public void setBlooming_season(String blooming_season) {
        this.blooming_season = blooming_season;
    }

    // Methods
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a flower");
    }

    @Override
    public String toString() {
        return "Flower{" + super.toString() +
                ", average_num_petals=" + average_num_petals +
                ", color_pistil='" + color_pistil + '\'' +
                ", color_petals='" + color_petals + '\'' +
                ", flower_variety='" + flower_variety + '\'' +
                ", blooming_season='" + blooming_season + '\'' +
                '}';
    }
}
