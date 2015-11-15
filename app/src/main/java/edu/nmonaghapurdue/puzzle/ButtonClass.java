package edu.nmonaghapurdue.puzzle;

/**
 * Created by Nathanael on 11/15/2015.
 */
public class ButtonClass {
    private int location;
    private int difficulty;
    private int picture;
    public ButtonClass(int buttonLocation, int difficulty, int picture) {
        this.location = buttonLocation;
        this.difficulty = difficulty;
        this.picture = picture;
    }
    public void checksPutPiece() {
        if (difficulty == 1) {


        }
        if (difficulty == 2) {











































            if (picture == 9 && (location == 5 || location == 9 || location == 10)) {

            }

            if (picture == 9 && (location == 15 || location == 14 || location == 19)) {

            }


            if (picture == 4 && (location == 21 || location == 16 || location == 17 || location == 18)) {

            }


            if (picture == 8 && (location == 7 || location == 11 || location == 12 || location == 13) {

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
