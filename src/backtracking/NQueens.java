package backtracking;

import java.util.Scanner;

public class NQueens {

    static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 4){
            System.out.println("Can't place in "+n+"*"+n);
            return;
        }
        nQueen(0, 0, new int[n][n], n, "");
    }

    private static void nQueen(int row, int col, int[][] board, int rq, String path) {
        //Base
        if (rq == 0) {
            counter++;
            System.out.println(counter+"-->"+path);
            return;
        }

        if (!isInBoundary(row, col, board.length)) {
            return;
        }

        if (canPlace(row, col, board)){
            board[row][col] = 1;
            nQueen(row + 1, 0, board, rq - 1, path +"["+row+","+col+"]" );
            board[row][col] = 0;
        }

        nQueen(row, col + 1, board, rq, path);
    }

    private static boolean isInBoundary(int row, int col, int n) {
        return row >= 0 && col >= 0 && row < n && col < n;
    }

    private static boolean canPlace(int row, int col, int[][] board) {
        int r = row - 1;
        int c = col;
        while (r >= 0) {
            if (board[r][c]  == 1)
                return false;
            r--;
        }
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0){
            if (board[r][c] == 1)
                return false;
            r--;
            c--;
        }
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 1)
                return false;
            r--;
            c++;
        }

        return true;
    }
}
