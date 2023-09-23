package Integrative_Exercises.E01_Pokemon_Game.Starters;

import Integrative_Exercises.E01_Pokemon_Game.types.Fire;
import Integrative_Exercises.E01_Pokemon_Game.types.Pokemon;

public class Charmander extends Pokemon implements Fire {

    // Constructors
    public Charmander() {
    }

    public Charmander(int poke_number, String poke_name, double poke_weight, char poke_gender, int season_appears, String poke_type){
        super(poke_number, poke_name, poke_weight, poke_gender, season_appears, poke_type);
    }

    // Methods
    @Override
    public void attackPFistFire() {
        System.out.println("Now Charmander is using Punch of Fire!");
    }

    @Override
    public void attackAcquires() {
        System.out.println("Now Charmander is using Acquires!");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("Now Charmander is using Flamethrower!");
    }

    @Override
    public void tackle_attack() {
        System.out.println("Now Charmander is using Tackle!");
    }

    @Override
    public void scratch_attack() {
        System.out.println("Now Charmander is using Scratch!");
    }

    @Override
    public void nibble_attack() {
        System.out.println("Now Charmander is using Nibble!");
    }
}
