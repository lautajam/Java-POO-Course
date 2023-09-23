package Integrative_Exercises.E01_Pokemon_Game;

import Integrative_Exercises.E01_Pokemon_Game.Starters.Pikachu;
import Integrative_Exercises.E01_Pokemon_Game.Starters.Squirtle;
import Integrative_Exercises.E01_Pokemon_Game.Starters.Charmander;
import Integrative_Exercises.E01_Pokemon_Game.Starters.Bulbasaur;

public class Main_Pokemon_Game {

    public static void main(String[] args) {

        Pikachu pika = new Pikachu(1, "Pikachu", 6.0,
                                    'M', 1, "Electric");

        Squirtle squirtle = new Squirtle(2, "Squirtle", 9.0,
                                            'F', 1, "Water");

        Charmander charmander = new Charmander(3, "Charmander", 8.0,
                                                'M', 1, "Fire");

        Bulbasaur bulbasaur = new Bulbasaur(4, "Bulbasaur", 5.0,
                                            'F', 1, "Water");

        pika.attackThunderclap();
        pika.attackFistThunder();
        pika.attackRay();
        pika.attackChargeRay();
        pika.tackle_attack();
        pika.scratch_attack();
        pika.nibble_attack();

        System.out.println("-----------------------------------------");

        squirtle.attackWaterGun();
        squirtle.attackHydroPump();
        squirtle.tackle_attack();
        squirtle.scratch_attack();
        squirtle.nibble_attack();

        System.out.println("-----------------------------------------");

        charmander.attackPFistFire();
        charmander.attackAcquires();
        charmander.attackFlamethrower();
        charmander.tackle_attack();
        charmander.scratch_attack();
        charmander.nibble_attack();

        System.out.println("-----------------------------------------");

        bulbasaur.attackSharpBlade();
        bulbasaur.attackParalyze();
        bulbasaur.attackDrain();
        bulbasaur.tackle_attack();
        bulbasaur.scratch_attack();
        bulbasaur.nibble_attack();
    }

}
