package edu.nmonaghapurdue.puzzle;

import android.graphics.Color;
import android.widget.Button;

/**
 * Created by Nathanael on 11/15/2015.
 */
public class ButtonClass {
    private int location;
    private int difficulty;
    private int picture;
    private Button[] grid;
    private Button[] images;
    public ButtonClass(int buttonLocation, int difficulty, int picture, Button[] grid, Button[] images) {
        this.location = buttonLocation;
        this.difficulty = difficulty;
        this.picture = picture;
        this.grid = grid;
        this.images = images;
    }
    public void checksPutPiece() {
        if (difficulty == 1) {
            if (location == 2 || location == 3 || location == 7 || location == 8 && (picture == 5)) {
                grid[2].setBackgroundColor(Color.CYAN);
                grid[3].setBackgroundColor(Color.CYAN);
                grid[7].setBackgroundColor(Color.CYAN);
                grid[8].setBackgroundColor(Color.CYAN);
                images[5].setText(Integer.parseInt(images[5].getText() + "") - 1 + "");
            }
            if (picture == 7 && location == 6) {
                grid[6].setBackgroundColor(Color.BLUE);
                images[7].setText(Integer.parseInt(images[7].getText() + "") - 1 + "");

            }
            if (picture == 6 && (location == 11 || location == 12 || location == 16 || location == 17 || location == 18)) {
                grid[11].setBackgroundColor(Color.GREEN);
                grid[12].setBackgroundColor(Color.GREEN);
                grid[16].setBackgroundColor(Color.GREEN);
                grid[17].setBackgroundColor(Color.GREEN);
                grid[18].setBackgroundColor(Color.GREEN);
                images[6].setText(Integer.parseInt(images[6].getText() + "") - 1 + "");

            }
            if (picture == 4 && (location == 4 || location == 9 || location == 13 || location == 14)) {
                grid[4].setBackgroundColor(Color.YELLOW);
                grid[9].setBackgroundColor(Color.YELLOW);
                grid[13].setBackgroundColor(Color.YELLOW);
                grid[14].setBackgroundColor(Color.YELLOW);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1 + "");
            }
            if (picture == 4 && (location == 10 || location == 15 || location == 19 || location == 20)) {
                grid[10].setBackgroundColor(Color.BLACK);
                grid[15].setBackgroundColor(Color.BLACK);
                grid[19].setBackgroundColor(Color.BLACK);
                grid[20].setBackgroundColor(Color.BLACK);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1 + "");
            }

        }

        if (difficulty == 2) {
            if (picture == 9 && (location == 5 || location == 9 || location == 10)) {

            }

            if (picture == 9 && (location == 15 || location == 14 || location == 19)) {

            }


            if (picture == 4 && (location == 21 || location == 16 || location == 17 || location == 18)) {

            }


            if (picture == 8 && (location == 7 || location == 11 || location == 12 || location == 13)) {

            }


            if (picture == 7 && (location == 20)) {

            }


        }

        if (difficulty == 3) {
            if (picture == 3 && (location == 1 || location == 2 || location == 7 || location == 11 || location == 12)) {

            }
                // set b3


            if (picture == 1 && (location == 21 || location == 22 || location == 23 || location == 24 || location == 18)) {

            }
                // set b1

            if (picture == 9 && (location == 3 || location == 4 || location == 8)) {

            }
                // set b9


            if (picture == 10 && (location == 16 || location == 17)) {

            }
                    //set b10



            if (picture == 4 && (location == 14 || location == 15 || location == 20 || location == 25)) {

            }
                // set b4

        }
    }
}
