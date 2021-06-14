package backtracking;

import java.util.Arrays;

public class KnightTourSecondMethod {
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Arrays.fill(board[i], -1);
            }
        }

        int[] rowPath = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] colPath = {-1, 2, -2, 2, -2, 2, -1, 1};


//        int[] rowPath = { 2, 1, -1, -2, -2, -1, 1, 2 };
//        int[] colPath = { 1, 2, 2, 1, -1, -2, -2, -1 };

        board[0][0] = 0;
        knightOnTheTour(board, 0, 0, 1, rowPath, colPath);
    }

    private static boolean knightOnTheTour(int[][] board, int row, int col, int count, int[] rowPath, int[] colPath) {
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
        for (int i = 0; i < rowPath.length; i++) {
            int newRow = row - rowPath[i];
            int newCol = col - colPath[i];
            if (canIPlaceAt(board, newRow, newCol)){
                board[newRow][newCol] = count;
                if (knightOnTheTour(board, newRow, newCol, count + 1, rowPath, colPath))
                    return true;
                else
                    board[newRow][newCol] = -1;
            }
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
