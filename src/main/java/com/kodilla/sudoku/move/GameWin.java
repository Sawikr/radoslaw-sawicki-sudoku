package com.kodilla.sudoku.move;

import com.kodilla.sudoku.option.GameOption;
import static com.kodilla.sudoku.display.GameBoard.printBoard;
import static com.kodilla.sudoku.logic.SolveBoard.solveBoard;

public class GameWin {

    public static boolean gameWin;

    public static void gameWin(int[][] board) {
        if (solveBoard(board)) {
            System.out.println("\nSolved successfully!");
            gameWin = true;
            GameOption.gameChoice(board);
        }
        else {
            System.out.println("\nUnsolvable board :(");
            printBoard(board);
        }
    }
}
