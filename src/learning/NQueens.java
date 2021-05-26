package learning;

import java.util.ArrayList;

public class NQueens {
    public static void main(String[] args) {

        ArrayList<String> allSolutions = new ArrayList<>();
        nQueens(0, 0, new int[4][4], 4, "", allSolutions);
        for (String s : allSolutions)
            System.out.println(s);
    }

    private static void nQueens(int row, int col, int[][] board, int rq, String sol, ArrayList<String> allSol) {

        if (rq == 0) {
            allSol.add(sol);
            return;
        }

        if (!isInBoundary(row, col, board))
            return;

        if (isSafeToPlace(row, col, board)) {
            board[row][col] = 1;
            nQueens(row + 1, 0, board, rq - 1, sol + " " + (col + 1), allSol);
            board[row][col] = 0;
        }

        nQueens(row, col + 1, board, rq, sol, allSol);
    }

    private static boolean isSafeToPlace(int row, int col, int[][] board) {

        int r = row;
        int c = col;
        while (r >= 0) {
            if (board[r][c] == 1) {
                return false;
            }
            r--;
        }

        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 1)
                return false;
            r--;
            c--;
        }

        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 1)
                return false;
            r--;
            c++;
        }

        return true;
    }

    private static boolean isInBoundary(int row, int col, int[][] board) {
        return row >= 0 && col >= 0 && row < board.length && col < board.length;
    }
}
