package ru.job4j.puzzle;

public class Win {
    public static boolean checkHorizontal(int[][] board, int row) {
        for (int i : board[row]) {
            if (i != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVertical(int[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkVertical(board, i) || checkHorizontal(board, i))) {
                return  true;
            }
        }
        return false;
    }
}
