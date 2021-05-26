package backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] m = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        ArrayList<String> allPaths = findPath(m, 4);
        for (String e : allPaths) {
            System.out.println(e);
        }
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> allPaths = new ArrayList<>();
        if(m[0][0] != 1)
            return allPaths;
        if (m[n-1][n-1] != 1)
            return allPaths;
        ratInMaze(0, 0, m, "", new boolean[4][4], allPaths);
        return allPaths;
    }

    private static void ratInMaze(int row, int col, int[][] m, String path, boolean[][] visited, ArrayList<String> allPaths) {
        if (!isSafeAndCanGo(row, col, m))
            return;
        if (row == m.length - 1 && col == m.length - 1) {
            allPaths.add(path);
            return;
        }

        visited[row][col] = true;
        if (isSafeAndCanGo(row + 1, col, m) && !visited[row + 1][col]) {
            ratInMaze(row + 1, col, m, path + "D", visited, allPaths);
        }
        if (isSafeAndCanGo(row, col - 1, m) && !visited[row][col - 1]) {
            ratInMaze(row, col - 1, m, path + "L", visited, allPaths);
        }
        if (isSafeAndCanGo(row, col + 1, m) && !visited[row][col + 1]) {
            ratInMaze(row, col + 1, m, path + "R", visited, allPaths);
        }
        if (isSafeAndCanGo(row - 1, col, m) && !visited[row - 1][col]) {
            ratInMaze(row - 1, col, m, path + "U", visited, allPaths);
        }

        visited[row][col] = false;
    }

    private static boolean isSafeAndCanGo(int row, int col, int[][] m) {
        if (row >= 0 && col >= 0 && row < m.length && col < m.length)
            return m[row][col] != 0;
        return false;
    }

}
