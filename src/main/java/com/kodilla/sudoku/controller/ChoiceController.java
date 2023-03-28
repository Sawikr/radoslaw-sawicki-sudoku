package com.kodilla.sudoku.controller;

import com.kodilla.sudoku.exception.DimFromIntroductionException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ChoiceController {

    public static int getDimFromIntroduction(int dim) {
        while (dim < 3 || dim > 10) {
            try {
                try {
                    System.out.println("Choice invalid, please try again!" +
                            "\nEnter the size of the game board [3-10]:");
                    //Created one exception as an exercise!
                    throw new NoSuchElementException();
                } catch (NoSuchElementException e) {
                    throw new DimFromIntroductionException("We caught exception: DimFromIntroductionException!");
                }
            } catch (DimFromIntroductionException e) {
                System.out.println("We caught exception DimFromIntroductionException: " + e.getCause() + "!");
            } finally {
                dim = new Scanner(System.in).nextInt();
            }
        }
        return dim;
    }

    public static int getCorrectArrayIndex(int[][] board, int rowOrCol){
        int dim = board.length;
        while (rowOrCol < 0 || rowOrCol >= dim) {
            System.out.println("Move invalid, please try again!");
            rowOrCol = new Scanner(System.in).nextInt();
        }
        return rowOrCol;
    }

    public static int getCorrectNumber(int value){
        while (value < 0 || value >= 9) {
            System.out.println("Number invalid, please try again!");
            value = new Scanner(System.in).nextInt();
        }
        return value;
    }

    public static void getIndexFromBoard(int[][] board){
        System.out.println("Move invalid, please try again!");
        //PerformMove.performPlayerMove(board, activePlayer);
    }

    public static String getCorrectNameConsoleSaveGame(String choice){
        while (!choice.equals("PLAY") && !choice.equals("SOLVE") && !choice.equals("QUIT")) {
            System.out.println("Choice invalid, please try again!");
            Scanner input = new Scanner(System.in);
            choice = input.next().toUpperCase();
        }
        return choice;
    }
}
