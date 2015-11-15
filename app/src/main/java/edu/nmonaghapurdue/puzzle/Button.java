package edu.nmonaghapurdue.puzzle;

/**
 * Created by Nathanael on 11/15/2015.
 */
public class Button {
    private int buttonLocation;
    private int difficulty;
    private String picture;
    public Button(int buttonLocation, int difficulty, String picture) {
        this.buttonLocation = buttonLocation;
        this.difficulty = difficulty;
        this.picture = picture;
    }
}
