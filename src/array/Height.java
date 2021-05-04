package array;

import java.util.Arrays;

public class Height {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 10};
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - k < 0) {
                arr[i] += k;
            } else {
                arr[i] -= k;
            }
            if (arr[i] < min && arr[i] != 0)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];

        }
        PrintArray.printArray(arr);
        System.out.println(max - min);
    }
}
