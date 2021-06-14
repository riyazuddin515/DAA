package backtracking;

import java.util.Arrays;

public class KnightTour {
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Arrays.fill(board[i], -1);
            }
        }
        board[0][0] = 0;
        knightOnTheTour(board, 0, 0, 1);
    }

    private static boolean knightOnTheTour(int[][] board, int row, int col, int count) {
        //Base condition
        if (!inTheBoundary(board, row, col))
            return false;

        if (count == 64) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        }

        //recur
        if (canIPlaceAt(board, row - 2, col - 1)) {
            board[row - 2][col - 1] = count;
            if (knightOnTheTour(board, row - 2, col - 1, count + 1))
                return true;
            else
                board[row - 2][col - 1] = -1;
        }
        if (canIPlaceAt(board, row - 2, col + 1)) {
            board[row - 2][col + 1] = count;
            if (knightOnTheTour(board, row - 2, col + 1, count + 1))
                return true;
            else
                board[row - 2][col + 1] = -1;
        }
        if (canIPlaceAt(board, row - 1, col - 2)) {
            board[row - 1][col - 2] = count;
            if (knightOnTheTour(board, row - 1, col - 2, count + 1))
                return true;
            else
                board[row - 1][col - 2] = -1;
        }
        if (canIPlaceAt(board, row - 1, col + 2)) {
            board[row - 1][col + 2] = count;
            if (knightOnTheTour(board, row - 1, col + 2, count + 1))
                return true;
            else
                board[row - 1][col + 2] = -1;
        }
        if (canIPlaceAt(board, row + 1, col - 2)) {
            board[row + 1][col - 2] = count;
            if (knightOnTheTour(board, row + 1, col - 2, count + 1))
                return true;
            else
                board[row + 1][col - 2] = -1;
        }
        if (canIPlaceAt(board, row + 1, col + 2)) {
            board[row + 1][col + 2] = count;
            if (knightOnTheTour(board, row + 1, col + 2, count + 1))
                return true;
            else
                board[row + 1][col + 2] = -1;
        }
        if (canIPlaceAt(board, row + 2, col - 1)) {
            board[row + 2][col - 1] = count;
            if (knightOnTheTour(board, row + 2, col - 1, count + 1))
                return true;
            else
                board[row + 2][col - 1] = -1;
        }
        if (canIPlaceAt(board, row + 2, col + 1)) {
            board[row + 2][col + 1] = count;
            if (knightOnTheTour(board, row + 2, col + 1, count + 1))
                return true;
            else
                board[row + 2][col + 1] = -1;
        }

        //else
        return false;
    }

    private static boolean inTheBoundary(int[][] board, int row, int col) {
        return row >= 0 && col >= 0 && row < board.length && col < board[0].length;
    }

    private static boolean canIPlaceAt(int[][] board, int row, int col) {
        if (inTheBoundary(board, row, col))
            return board[row][col] == -1;
        return false;
    }
}
