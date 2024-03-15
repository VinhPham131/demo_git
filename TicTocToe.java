/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

import java.util.Scanner;

/**
 *
 * @author nhipham
 */
public class TicTocToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        setupBoard();
        displayBoard();

        while (true) {
            playTurn();
            displayBoard();
            if (checkResult(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isFull()) {
                System.out.println("It's a tie!");
                break;
            }
            switchPlayer();
        }
    }

    private static void setupBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    private static void displayBoard() {
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static void playTurn() {
        Scanner sc = new Scanner(System.in);
        int row, col;

        do {
            System.out.print("Player " + currentPlayer + ", enter row (0, 1, 2): ");
            row = sc.nextInt();
            System.out.print("Player " + currentPlayer + ", enter column (0, 1, 2): ");
            col = sc.nextInt();
        } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ');

        board[row][col] = currentPlayer;
    }

    private static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    private static boolean checkResult(char player) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    private static boolean isFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
