package array;

import java.util.Arrays;

public class MedianEqualSize {
    public static void main(String[] args) {
//        int[] arr = {90, 100, 78, 89, 67};
//        int[] arr1 = {56, 67, 30, 79};
//        System.out.println(median(arr, arr.length));
//        System.out.println(median(arr1, arr1.length));

        int[] arr3 = {18, 2, 10, 13, 8, 8};
        System.out.println(median(arr3, arr3.length));
    }

    private static int median(int[] arr, int n) {
        Arrays.sort(arr);
        if(n == 1){
            return arr[0];
        }
        if(n == 2){
            return (arr[0]+arr[1])/2;
        }
        if(n%2 == 1){
            return arr[n/2];
        }else{
            int mid = n/2;
            int sum = (arr[mid-1] + arr[mid]);
            return (int) Math.floor((float)sum/2);
        }
    }
}
