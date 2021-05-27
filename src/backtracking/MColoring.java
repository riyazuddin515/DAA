package backtracking;

import java.util.Arrays;

public class MColoring {
    public static void main(String[] args) {

        int vertices = 4;
        int[][] graph = {
                {0,1,1,1},
                {1,0,1,0},
                {1,1,0,1},
                {1,0,1,0}
        };
        int[] assignedColors = new int[4];
        mColoring(graph, 0, assignedColors, 1, 3);
    }

    private static void mColoring(int[][] graph, int node, int[] assignedColors, int color, int maxColors) {

        //Return if current vertex is the end Vertex
        if (node == graph.length) {
            System.out.println(Arrays.toString(assignedColors));
            return;
        }
        if (color > maxColors)
            return;

        if (canAssign(graph,node, color, assignedColors)) {
            //If can able to assign a color move to next vertex
            assignedColors[node] = color;
            mColoring(graph, node + 1, assignedColors, 1, maxColors);
        }

        mColoring(graph, node, assignedColors, color + 1, maxColors);
    }

    private static boolean canAssign(int[][] graph,int node, int c, int[] assignedColors) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && c == assignedColors[i])
                return false;
        }
        return true;
    }
}