package Integrative_Exercises.E01_Pokemon_Game.types;

public abstract class Pokemon {

    // Attributes
    private int poke_number;
    private String poke_name;
    private double poke_weight;
    private char poke_gender;
    private int season_appears;
    private String poke_type;

    // Getters and Setters
    public int getPoke_number() {
        return poke_number;
    }

    public void setPoke_number(int poke_number) {
        this.poke_number = poke_number;
    }

    public String getPoke_name() {
        return poke_name;
    }

    public void setPoke_name(String poke_name) {
        this.poke_name = poke_name;
    }

    public double getPoke_weight() {
        return poke_weight;
    }

    public void setPoke_weight(double poke_weight) {
        this.poke_weight = poke_weight;
    }

    public char getPoke_gender() {
        return poke_gender;
    }

    public void setPoke_gender(char poke_gender) {
        this.poke_gender = poke_gender;
    }

    public int getSeason_appears() {
        return season_appears;
    }

    public void setSeason_appears(int season_appears) {
        this.season_appears = season_appears;
    }

    public String getPoke_type() {
        return poke_type;
    }

    public void setPoke_type(String poke_type) {
        this.poke_type = poke_type;
    }

    // Abstract Methods
    public abstract void tackle_attack();
    public abstract void scratch_attack();
    public abstract void nibble_attack();
}
