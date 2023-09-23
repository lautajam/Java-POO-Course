package Integrative_Exercises.E01_Pokemon_Game.Starters;

import Integrative_Exercises.E01_Pokemon_Game.types.Pokemon;
import Integrative_Exercises.E01_Pokemon_Game.types.Water;

public class Squirtle extends Pokemon implements Water {

    // Constructors
    public Squirtle() {
    }

    public Squirtle(int poke_number, String poke_name, double poke_weight, char poke_gender, int season_appears, String poke_type){
        super(poke_number, poke_name, poke_weight, poke_gender, season_appears, poke_type);
    }

    // Methods
    @Override
    public void tackle_attack() {
        System.out.println("My name is Squirtle and I'm using Tackle attack!");
    }

    @Override
    public void scratch_attack() {
        System.out.println("My name is Squirtle and I'm using Scratch attack!");
    }

    @Override
    public void nibble_attack() {
        System.out.println("My name is Squirtle and I'm using Nibble attack!");
    }

    @Override
    public void attackHydroPump() {
        System.out.println("My name is Squirtle and I'm using Hydro Pump attack!");
    }

    @Override
    public void attackWaterGun() {
        System.out.println("My name is Squirtle and I'm using Water Gun attack!");
    }

    @Override
    public void attackBubble() {
        System.out.println("My name is Squirtle and I'm using Bubble attack!");
    }

    @Override
    public void attackHydroPulse() {
        System.out.println("My name is Squirtle and I'm using Hydro Pulse attack!");
    }
}
