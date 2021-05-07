package DAA;

public class NQueens {

    static int counter = 0;

    public static void main(String[] args) {

        NQueens(new boolean[8][8], 0, 0, 8, 0, "");
    }

    private static void NQueens(boolean[][] board, int row, int col, int tq, int qstn, String ans) {

        if (tq == qstn) {
            counter++;
            System.out.println(counter+"-->"+ans);
            return;
        }

        if (col == board[0].length) {
            row++;
            col = 0;
        }

        if (row == board.length) {
            return;
        }

        if (isItSafeToPlaceTheQueen(board, row, col)) {
            board[row][col] = true;
            NQueens(board, row + 1, 0, tq, qstn + 1, ans + "["+row+","+col+"]");
            board[row][col] = false;
        }

        NQueens(board, row, col + 1, tq, qstn, ans);

    }

    private static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {

        //To Check vertically up
        int r = row - 1;
        int c = col;
        while (r >= 0){
            if (board[r][c]){
                return false;
            }
            r--;
        }

        //To Check Horizontally left
//        r = row;
//        c = col - 1;
//        while (c >= 0) {
//            if (board[r][c])
//                return  false;
//            c--;
//        }

        //To check diagonally left up
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c])
                return false;
            r--;
            c--;
        }

        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c])
                return false;
            r--;
            c++;
        }
        return true;
    }

}
