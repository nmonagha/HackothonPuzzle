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

            }
            if (picture == 7 && location == 6) {

            }
            if (picture == 6 && (location == 11 || location == 12 || location == 16 || location == 17 || location == 18)) {


            }
            if (picture == 4 && (location == 4 || location == 9 || location == 13 || location == 14)) {

            }
            if (picture == 4 && (location == 10 || location == 15 || location == 19 || location == 20)) {

            }

        }

        if (difficulty == 2) {
            if (picture == 9 && (location == 5 || location == 9 || location == 10)) {
                grid[5].setBackgroundColor(Color.BLUE);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

                grid[9].setBackgroundColor(Color.BLUE);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

                grid[10].setBackgroundColor(Color.BLUE);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);
            }

            if (picture == 9 && (location == 15 || location == 14 || location == 19)) {

                grid[15].setBackgroundColor(Color.LTGRAY);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

                grid[14].setBackgroundColor(Color.LTGRAY);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

                grid[19].setBackgroundColor(Color.LTGRAY);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);
            }


            if (picture == 4 && (location == 21 || location == 16 || location == 17 || location == 18)) {
                grid[21].setBackgroundColor(Color.YELLOW);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);

                grid[16].setBackgroundColor(Color.YELLOW);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);

                grid[17].setBackgroundColor(Color.YELLOW);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);

                grid[18].setBackgroundColor(Color.YELLOW);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);
            }


            if (picture == 8 && (location == 7 || location == 11 || location == 12 || location == 13)) {

                grid[7].setBackgroundColor(Color.DKGRAY);
                images[8].setText(Integer.parseInt(images[8].getText() + "") - 1);

                grid[11].setBackgroundColor(Color.DKGRAY);
                images[8].setText(Integer.parseInt(images[8].getText() + "") - 1);

                grid[12].setBackgroundColor(Color.DKGRAY);
                images[8].setText(Integer.parseInt(images[8].getText() + "") - 1);

                grid[13].setBackgroundColor(Color.DKGRAY);
                images[8].setText(Integer.parseInt(images[8].getText() + "") - 1);
            }


            if (picture == 7 && (location == 20)) {

                grid[10].setBackgroundColor(Color.CYAN);
                images[7].setText(Integer.parseInt(images[7].getText() + "") - 1);

            }


        }

        if (difficulty == 3) {
            if (picture == 3 && (location == 1 || location == 2 || location == 7 || location == 11 || location == 12)) {

                grid[1].setBackgroundColor(Color.MAGENTA);
                images[3].setText(Integer.parseInt(images[3].getText() + "") - 1);

                grid[2].setBackgroundColor(Color.MAGENTA);
                images[3].setText(Integer.parseInt(images[3].getText() + "") - 1);

                grid[7].setBackgroundColor(Color.MAGENTA);
                images[3].setText(Integer.parseInt(images[3].getText() + "") - 1);

                grid[11].setBackgroundColor(Color.MAGENTA);
                images[3].setText(Integer.parseInt(images[3].getText() + "") - 1);

                grid[12].setBackgroundColor(Color.MAGENTA);
                images[3].setText(Integer.parseInt(images[3].getText() + "") - 1);
            }
                // set b3


            if (picture == 1 && (location == 21 || location == 22 || location == 23 || location == 24 || location == 18)) {

                grid[21].setBackgroundColor(Color.BLACK);
                images[1].setText(Integer.parseInt(images[1].getText() + "") - 1);

                grid[22].setBackgroundColor(Color.BLACK);
                images[1].setText(Integer.parseInt(images[1].getText() + "") - 1);

                grid[23].setBackgroundColor(Color.BLACK);
                images[1].setText(Integer.parseInt(images[1].getText() + "") - 1);

                grid[24].setBackgroundColor(Color.BLACK);
                images[1].setText(Integer.parseInt(images[1].getText() + "") - 1);

                grid[18].setBackgroundColor(Color.BLACK);
                images[1].setText(Integer.parseInt(images[1].getText() + "") - 1);

            }
                // set b1

            if (picture == 9 && (location == 3 || location == 4 || location == 8)) {

                grid[3].setBackgroundColor(Color.BLUE);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

                grid[3].setBackgroundColor(Color.BLUE);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

                grid[8].setBackgroundColor(Color.BLUE);
                images[9].setText(Integer.parseInt(images[9].getText() + "") - 1);

            }
                // set b9


            if (picture == 10 && (location == 16 || location == 17)) {

                grid[16].setBackgroundColor(Color.GREEN);
                images[10].setText(Integer.parseInt(images[10].getText() + "") - 1);

                grid[17].setBackgroundColor(Color.GREEN);
                images[10].setText(Integer.parseInt(images[10].getText() + "") - 1);
            }
                    //set b10



            if (picture == 4 && (location == 14 || location == 15 || location == 20 || location == 25)) {


                grid[14].setBackgroundColor(Color.RED);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);

                grid[15].setBackgroundColor(Color.RED);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);

                grid[20].setBackgroundColor(Color.RED);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);

                grid[25].setBackgroundColor(Color.RED);
                images[4].setText(Integer.parseInt(images[4].getText() + "") - 1);
            }
                // set b4

        }
    }
}
