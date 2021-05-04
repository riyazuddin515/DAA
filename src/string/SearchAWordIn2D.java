package string;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchAWordIn2D {

    static int r, c;
    static int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};


    private static boolean search(char[][] grid, int row, int col, String word) {
        if (grid[row][col] != word.charAt(0))
            return false;

        int len = word.length();

        for (int dir = 0; dir < 8; dir++) {

            int k, rd = row + x[dir], cd = col + y[dir];

            for (k = 1; k < len; k++) {

                if (rd < 0 || rd >= r || cd < 0 || cd >= c)
                    break;

                if (grid[rd][cd] != word.charAt(k))
                    break;

                rd += x[dir];
                cd += y[dir];

            }
            if (k == len)
                return true;
        }
        return false;
    }

    private static int[][] patternSearch(char[][] grid, String word) {
        ArrayList<String> al = new ArrayList<>(r*c);
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (search(grid, row, col, word))
                    al.add("{"+row+","+col+"}");
            }
        }
        if (al.isEmpty()){
            al.add("-1");
        }

        return (int[][]) al.toArray();
    }


    public static void main(String[] args) {

        char[][] grid = {{'a','b','a','b'},{'a','b','e','b'},{'e','b','e','b'}};
        r = grid.length;
        c = grid[0].length;
        int[][] ans = patternSearch(grid, "abe");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}
