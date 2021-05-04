package array;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
//        int[] arr1 = {4, 2, -3, 1, 6};
//        int[] arr2 = {4, 2, 0, 1, 6};
//        int[] arr3 = {10, -10};
//        int[] arr4 = {0, 9, 7, -12, 5};
//        System.out.println(subSum(arr1, arr1.length));
//        System.out.println(subSum(arr2, arr2.length));
//        System.out.println(subSum(arr3, arr3.length));
//        System.out.println(subSum(arr4, arr4.length));

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int r = 4, c = 4;

        ArrayList<Integer> al = new ArrayList<>(r*c);

        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        int di = 0;

        while(top <= bottom && left <= right){
            if(di == 0){
                for(int i = top; i <= right; i++){
                    al.add(arr[top][i]);
                }
                top--;
            }
            else if(di == 1){
                for(int i = top; i <= bottom; i++){
                    al.add(arr[i][right]);
                }
                right--;
            }
            else if(di == 1){
                for(int i = top; i <= bottom; i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(di == 2){
                for(int i = right; i >= left; i--){
                    al.add(arr[bottom][i]);
                }
                bottom--;
            }
            else if(di == 3){
                for(int i = bottom; i >= top; i--){
                    al.add(arr[i][left]);
                }
                left++;
            }
            di = (di + 1) % 4;

    }
//    private static boolean subSum(int[] arr, int n){
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        int sum = 0;
//        for(int i = 0; i < n; i++){
//            sum = sum + arr[i];
//
//            if(!hm.containsKey(sum)){
//                hm.put(sum, 0);
//            }else{
//                hm.put(sum, 1);
//            }
//
//            if(sum == 0 || arr[i] == 0 || hm.get(sum) == 1){
//                return true;
//            }
//        }
//
//        return false;
    }
}
