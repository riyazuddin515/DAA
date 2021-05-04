package array;

import java.lang.reflect.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int left = 0;
        int right = arr.length-1;
        int temp;
        while (left <= right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
