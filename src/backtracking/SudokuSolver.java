package backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] grid = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        solver(grid, 0, 0, 1);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean solver(int[][] grid, int row, int col, int choice) {
        //Base
        if (col == grid[0].length) {
            row++;
            col = 0;
        }
        if (row == grid.length) {
            return true;
        }
        if (choice > 9) {
            return false;
        }
        //recur
        if (grid[row][col] != 0) {
            return solver(grid, row, col + 1, 1);
        }

        if (grid[row][col] == 0 && canWePlace(grid, row, col, choice)) {
            grid[row][col] = choice;
            if (solver(grid, row, col + 1, 1))
                return true;
            else
                grid[row][col] = 0;
        }
        return solver(grid, row, col, choice + 1);
    }

    private static boolean canWePlace(int[][] grid, int row, int col, int choice) {
        int r = 0;
        int c = col;
        while (r < grid.length) {
            if (grid[r][c] == choice)
                return false;
            r++;
        }

        r = row;
        c = 0;
        while (c < grid[0].length) {
            if (grid[r][c] == choice)
                return false;
            c++;
        }

        r = row - (row % 3);
        c = col - (col % 3);
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == choice)
                    return false;
            }
        }
        return true;
    }
}
