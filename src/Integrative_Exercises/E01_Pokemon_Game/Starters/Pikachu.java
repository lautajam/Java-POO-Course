package Integrative_Exercises.E01_Pokemon_Game.Starters;

import Integrative_Exercises.E01_Pokemon_Game.types.Electric;
import Integrative_Exercises.E01_Pokemon_Game.types.Pokemon;

public class Pikachu extends Pokemon implements Electric {

    // Constructors
    public Pikachu() {
    }

    public Pikachu(int poke_number, String poke_name, double poke_weight, char poke_gender, int season_appears, String poke_type){
        super(poke_number, poke_name, poke_weight, poke_gender, season_appears, poke_type);
    }

    // Methods
    @Override
    public void attackThunderclap() {
        System.out.println("I'm Pikachu and I'm attacking with Thunderclap!");
    }

    @Override
    public void attackFistThunder() {
        System.out.println("I'm Pikachu and I'm attacking with Fist Thunder!");
    }

    @Override
    public void attackRay() {
        System.out.println("I'm Pikachu and I'm attacking with Ray!");
    }

    @Override
    public void attackChargeRay() {
        System.out.println("I'm Pikachu and I'm attacking with Charge Ray!");
    }

    @Override
    public void tackle_attack() {
        System.out.println("I'm Pikachu and I'm attacking with Tackle!");
    }

    @Override
    public void scratch_attack() {
        System.out.println("I'm Pikachu and I'm attacking with Scratch!");
    }

    @Override
    public void nibble_attack() {
        System.out.println("I'm Pikachu and I'm attacking with Nibble!");
    }
}
