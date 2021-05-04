package matrix;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int t = 8;
        int[][] matrix1 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int t1 = 30;
        System.out.print(searchMatrix(matrix, t));
        System.out.print(searchMatrix(matrix1, t1));


    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        int rMax = matrix.length;
        while(r < rMax && c >= 0){
            if(matrix[r][c] == target)
                return true;
            if(target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}
