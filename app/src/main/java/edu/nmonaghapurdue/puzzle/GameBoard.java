package edu.nmonaghapurdue.puzzle;

/**
 * Created by Nathanael on 11/14/2015.
 */
public class GameBoard {
    private int length;
    private int width;
    private int difficulty;
    GameBoard(int length, int width, int difficulty) {
        this.length = length;
        this.width = width;
        this.difficulty = difficulty;
    }
    public int[][] gameBord() {
        return new int[1][1];

    }
}
