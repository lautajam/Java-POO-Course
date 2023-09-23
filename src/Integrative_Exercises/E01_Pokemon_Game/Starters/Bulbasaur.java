package Integrative_Exercises.E01_Pokemon_Game.Starters;

import Integrative_Exercises.E01_Pokemon_Game.types.Plant;
import Integrative_Exercises.E01_Pokemon_Game.types.Pokemon;

public class Bulbasaur extends Pokemon implements Plant {

    // Constructor
    public Bulbasaur() {
    }

    public Bulbasaur(int poke_number, String poke_name, double poke_weight, char poke_gender, int season_appears, String poke_type){
        super(poke_number, poke_name, poke_weight, poke_gender, season_appears, poke_type);
    }

    // Methods
    @Override
    public void attackParalyze() {
        System.out.println("Bulbasaur used Paralyze!");
    }

    @Override
    public void attackDrain() {
        System.out.println("Bulbasaur used Drain!");
    }

    @Override
    public void attackSharpBlade() {
        System.out.println("Bulbasaur used Sharp Blade!");
    }

    @Override
    public void attackWhipStrain() {
        System.out.println("Bulbasaur used Whip Strain!");
    }

    @Override
    public void tackle_attack() {
        System.out.println("Bulbasaur used Tackle!");
    }

    @Override
    public void scratch_attack() {
        System.out.println("Bulbasaur used Scratch!");
    }

    @Override
    public void nibble_attack() {
        System.out.println("Bulbasaur used Nibble!");
    }
}
