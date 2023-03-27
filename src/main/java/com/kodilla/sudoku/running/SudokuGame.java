package com.kodilla.sudoku.running;

import com.kodilla.sudoku.display.Board;
import static com.kodilla.sudoku.display.GameBoard.printBoard;
import static com.kodilla.sudoku.logic.SolveBoard.solveBoard;

public class SudokuGame {

    public static void main(String[] args) {

        System.out.println("\nSudoku Game started!:\n");
        printBoard(Board.board());

        if (solveBoard(Board.board())) {
            System.out.println("\nSolved successfully!");
        }
        else {
            System.out.println("\nUnsolvable board :(");
            printBoard(Board.board());
        }
    }
}