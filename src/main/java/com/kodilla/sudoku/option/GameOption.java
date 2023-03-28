package com.kodilla.sudoku.option;

import com.kodilla.sudoku.controller.ChoiceController;
import com.kodilla.sudoku.move.GameWin;
import com.kodilla.sudoku.running.SudokuGame;
import java.util.Scanner;

enum OptionGame {
    PLAY,
    QUIT;

    public static void gameOption(OptionGame option, int[][] board) {
        switch (option) {
            case PLAY -> {
                if (GameWin.gameWin) {
                    SudokuGame.runningGame();
                }
                else
                    System.out.println("Continue playing!");
            }
            case QUIT -> {
                System.out.println("\nEND GAME!");
                System.exit(0);
            }
        }
    }
}

public class GameOption {

    static OptionGame option;
    static Scanner input;
    public static String choice;

    public GameOption(OptionGame option) {
        GameOption.option = option;
    }

    public static void gameChoice(int[][] board) {
        System.out.print("\nGame option:" +
                "\nPLAY - continue game" +
                "\nQUIT - end of the game\n" +
                "\nSelect a game option: ");

        input = new Scanner(System.in);
        choice = input.next().toUpperCase();

        String correct = ChoiceController.getCorrectNameConsoleSaveGame(choice);
        if (correct.equals("PLAY") || correct.equals("QUIT"))
            OptionGame.gameOption(OptionGame.valueOf(correct), board);
    }
}
