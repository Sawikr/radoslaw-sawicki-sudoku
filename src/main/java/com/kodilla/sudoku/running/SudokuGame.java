package com.kodilla.sudoku.running;

import com.kodilla.sudoku.display.GameBoard;
import com.kodilla.sudoku.display.GameIntroduction;
import com.kodilla.sudoku.move.GameWin;
import com.kodilla.sudoku.option.GameOption;
import static com.kodilla.sudoku.display.GameBoard.printBoard;
import static com.kodilla.sudoku.display.GameBoard.printEmptyBoard;

public class SudokuGame {

    public static void main(String[] args) {

        runningGame();
    }

    public static void runningGame() {
        int[][] board = GameIntroduction.printIntroduction();

        if (GameWin.gameWin) {
            GameWin.gameWin = false;
            printEmptyBoard(board);
            GameBoard.printPlayerSelection(board);
        }
        else {
            printBoard(board);
            GameOption.gameChoice(board);
            GameBoard.printPlayerSelection(board);
        }
    }
}