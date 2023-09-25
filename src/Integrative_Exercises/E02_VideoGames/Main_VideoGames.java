package Integrative_Exercises.E02_VideoGames;

import java.util.ArrayList;
import java.util.List;

public class Main_VideoGames {
    public static void main(String[] args) {

        // First task
        List<VideoGames> videogames_list = new ArrayList<>();

        VideoGames vg1 = new VideoGames(1, "The Legend of Zelda: Breath of the Wild", "Nintendo",
                                        45017, "Adventure/Action");

        VideoGames vg2 = new VideoGames(7, "Super Mario 64", "Nintendo 64",
                                        19196, "Platform");

        VideoGames vg3 = new VideoGames(3, "Red Dead Redemption 2", "Rockstar Games",
                                        25618, "Western");

        VideoGames vg4 = new VideoGames(4, "The Elder Scrolls V: Skyrim", "Bethesda",
                                         23456, "Role");

        VideoGames vg5 = new VideoGames(5, "Minecraft Java edition", "Mojang",
                                        654754, "SandBox");

        videogames_list.add(vg1);
        videogames_list.add(vg2);
        videogames_list.add(vg3);
        videogames_list.add(vg4);
        videogames_list.add(vg5);

        // Second task
        for (VideoGames videogame : videogames_list){
            System.out.println("Title: " + videogame.getTitle() + ", Console: " + videogame.getConsole() + " & Quantity " +
                    "Players: " + videogame.getQuantityPlayers());
        }

        System.out.println("----------------------------------------------");
        System.out.println("Changing some things...");

        // Third task
        vg3.setTitle("Hello Kitty and friends");
        vg3.setQuantityPlayers(123456);

        vg2.setTitle("Terraria");
        vg2.setQuantityPlayers(9876);

        System.out.println("Some things have changed");

        for (VideoGames videogame : videogames_list){
            System.out.println("Title: " + videogame.getTitle() + ", Console: " + videogame.getConsole() + " & Quantity " +
                    "Players: " + videogame.getQuantityPlayers());
        }

        System.out.println("----------------------------------------------");
        System.out.println("Searching...");
        // Forty task
        for (VideoGames videogame : videogames_list)
            if (videogame.getConsole().equalsIgnoreCase("Nintendo 64")){
                System.out.println("Title: " + videogame.getTitle() + ", Console: " + videogame.getConsole() + " & Quantity " +
                        "Players: " + videogame.getQuantityPlayers());
            }
        }
    }
