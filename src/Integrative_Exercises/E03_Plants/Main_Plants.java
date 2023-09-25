package Integrative_Exercises.E03_Plants;

import Integrative_Exercises.E03_Plants.Plans_Types.Flower;
import Integrative_Exercises.E03_Plants.Plans_Types.Shrub;
import Integrative_Exercises.E03_Plants.Plans_Types.Tree;

public class Main_Plants {
    public static void main(String[] args) {

        Tree tree = new Tree("Tree", 10, true, "Tropical",
                                "5", "Rounded", 5.7, "Green", "Broad");

        Flower flower = new Flower("Flower", 1, true, "Tropical",
                                    23, "Yellow", "White",
                                    "Pink", "Blue");

        Shrub shrub = new Shrub("Shrub", 2, true, "Tropical",
                                    1.5, true, "Rounded",
                                    "Green", true);

        // Calling methods
        tree.sayHello();
        flower.sayHello();
        shrub.sayHello();
    }
}
