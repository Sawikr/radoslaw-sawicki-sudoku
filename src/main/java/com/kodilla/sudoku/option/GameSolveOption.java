package com.kodilla.sudoku.option;

import com.kodilla.sudoku.controller.ChoiceController;
import com.kodilla.sudoku.move.GameWin;
import java.util.Scanner;

enum OptionSolveGame {
    PLAY,
    SOLVE,
    QUIT;

    public static void gameOption(OptionSolveGame option, int[][] board) {
        switch (option) {
            case PLAY -> {
                System.out.println("Continue playing!");
            }
            case SOLVE -> {
                GameWin.gameWin(board);
            }
            case QUIT -> {
                System.out.println("\nEND GAME!");
                System.exit(0);
            }
        }
    }
}

public class GameSolveOption {

    static OptionSolveGame option;
    static Scanner input;
    public static String choice;

    public GameSolveOption(OptionSolveGame option) {
        GameSolveOption.option = option;
    }

    public static void gameChoice(int[][] board) {
        System.out.print("\nGame option:" +
                "\nPLAY - continue game" +
                "\nSOLVE - solve game" +
                "\nQUIT - end of the game\n" +
                "\nSelect a game option: ");

        input = new Scanner(System.in);
        choice = input.next().toUpperCase();

        String correct = ChoiceController.getCorrectNameConsoleSaveGame(choice);
        if (correct.equals("PLAY") || correct.equals("SOLVE") || correct.equals("QUIT"))
            OptionSolveGame.gameOption(OptionSolveGame.valueOf(correct), board);
    }
}
