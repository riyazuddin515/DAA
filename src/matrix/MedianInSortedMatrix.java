package matrix;

import java.util.Arrays;
import java.util.Comparator;

public class MedianInSortedMatrix {
    public static void main(String[] args) {
        int[][] m = {{1, 3, 5},{2, 6, 9},{3, 6, 9}};
        median(m,3,3);
    }
    private static void median(int[][] matrix, int r, int c) {
        // code here
        Arrays.sort(matrix, Comparator.comparingInt(a -> a[0]));
        for (int[] i : matrix) {
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
