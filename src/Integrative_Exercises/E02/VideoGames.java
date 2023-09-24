package Integrative_Exercises.E02;

public class VideoGames {

    // Attributes
    private int    code;
    private String title;
    private String console;
    private int    quantityPlayers;
    private String category;

    // Constructors
    public VideoGames() {
    }

    public VideoGames(int code, String title, String console, int quantityPlayers, String category) {
        this.code = code;
        this.title = title;
        this.console = console;
        this.quantityPlayers = quantityPlayers;
        this.category = category;
    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getQuantityPlayers() {
        return quantityPlayers;
    }

    public void setQuantityPlayers(int quantityPlayers) {
        this.quantityPlayers = quantityPlayers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
