package Backtracking;

import java.util.Arrays;

public class Sudoku {
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        // row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        // grid
        int startingRow = (row / 3) * 3;
        int startingCol = (col / 3) * 3;
        for (int i = startingRow; i < startingRow + 3; i++) {
            for (int j = startingCol; j < startingCol + 3; j++) {
                if (board[j][i] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helperForSudoku(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if (col != board.length - 1) {
            newRow = row;
            newCol = col + 1;
        } else {
            newRow = row + 1;
            newCol = 0;
        }

        if (board[row][col] != '.') {
            if (helperForSudoku(board, newRow, newCol)) {
                return true;
            } else {
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helperForSudoku(board, newRow, newCol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {
        helperForSudoku(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println("BEFORE: ");
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
            System.out.println();
        }
        solveSudoku(board);
        System.out.println("AFTER: ");
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
            System.out.println();
        }
    }
}
