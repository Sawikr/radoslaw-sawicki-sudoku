package com.kodilla.sudoku.display;

import com.kodilla.sudoku.controller.ChoiceController;
import com.kodilla.sudoku.move.GameWin;
import java.util.Scanner;

public class GameIntroduction {

    public static int[][] printIntroduction() {
        if(!GameWin.gameWin) {
            nameOfGame();
        }
        System.out.println("\nEnter the size of the game board [3-10]: ");
        int dimChoice = new Scanner(System.in).nextInt();
        var dim = ChoiceController.getDimFromIntroduction(dimChoice);
        int[][] board = new int[dim][dim];

        int dimMinusOne = dim - 1;
        System.out.println("The size of the game board is: " + dim + " x " + dim + "!\n" +
                "The size of the game board is from 0 to " + dimMinusOne + " rows and columns!\n");
        return board;
    }

    public static void nameOfGame() {
        System.out.println("\n>>> S T A R T  G A M E <<<");
        System.out.println("   >>> S u d o k u <<<");
    }
}
