package matrix;

import java.util.ArrayList;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int r = 4, c = 4;

        ArrayList<Integer> al = new ArrayList<>(16);

        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        int di = 0;

        while(top <= bottom && left <= right){
            if(di == 0){
                for (int i = top; i <= right; i++) {
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(di == 1){
                for(int i = top; i <= bottom; i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(di == 2){
                for(int i = right; i >= left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            else if(di == 3){
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            di = (di + 1) % 4;
        }
    }

}
