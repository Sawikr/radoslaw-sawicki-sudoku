package com.kodilla.sudoku.display;

import com.kodilla.sudoku.move.PerformMove;
import com.kodilla.sudoku.option.GameSolveOption;

public class GameBoard {

    public static final int GRID_SIZE = 9;

    public static void printBoard(int[][] board) {
        System.out.println("Game board:\n");
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.print("\t");
                System.out.println("---------------------------------------");
            }
            for (int column = 0; column < GRID_SIZE; column++) {
                System.out.print("   ");
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|   ");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    public static void printPlayerSelection(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                PerformMove.performPlayerMove(board);
                GameSolveOption.gameChoice(board);
            }
            for (int column = 0; column < GRID_SIZE; column++) {
                System.out.print("   ");
                if (column % 3 == 0 && column != 0) {
                    PerformMove.performPlayerMove(board);
                    GameSolveOption.gameChoice(board);
                }
            }
            System.out.println();
        }
    }

    public static void printEmptyBoard(int[][] board) {
        System.out.println("Game board:\n");
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.print("\t");
                System.out.println("---------------------------------------");
            }
            for (int column = 0; column < GRID_SIZE; column++) {
                System.out.print("   ");
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|   ");
                }
                board[row][column] = 0;
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }
}