package Integrative_Exercises.E03_Plants.Plans_Types;

public abstract class Plants {

    // Attributes
    private String name;
    private int stem_height;
    private boolean hasLeaves;
    private String ideal_climate;

    // Constructors
    public Plants() {
    }

    public Plants(String name, int stem_height, boolean hasLeaves, String ideal_climate) {
        this.name = name;
        this.stem_height = stem_height;
        this.hasLeaves = hasLeaves;
        this.ideal_climate = ideal_climate;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStem_height() {
        return stem_height;
    }

    public void setStem_height(int stem_height) {
        this.stem_height = stem_height;
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public String getIdeal_climate() {
        return ideal_climate;
    }

    public void setIdeal_climate(String ideal_climate) {
        this.ideal_climate = ideal_climate;
    }

    // Methods
    public abstract void sayHello();

    @Override
    public String toString() {
        return "Plants{" +
                "name='" + name + '\'' +
                ", stem_height=" + stem_height +
                ", hasLeaves=" + hasLeaves +
                ", ideal_climate='" + ideal_climate + '\'' +
                '}';
    }
}
