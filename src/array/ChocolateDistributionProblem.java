package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int m1 = 5;
        int[] arr1 = {3, 4, 1, 9, 56, 7, 9, 12};

        int m2 = 3;
        int[] arr2 = {7, 3, 2, 4, 9, 12, 56};

        int m3 = 9;
        int[] arr3 = {17, 83, 59, 25, 38, 63, 25, 1 ,37};

        System.out.println(minDiff(arr1, arr1.length, m1));
        System.out.println(minDiff(arr2, arr2.length, m2));
        System.out.println(minDiff(arr3, arr3.length, m3));
    }

    private static int minDiff(int[] arr, int n, int m) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= n-m; i++){
            int end = i+m-1;
            if(arr[end] - arr[i] < min){
                min = arr[end] - arr[i];
            }
        }
        return min;
    }

    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        int n_int = (int) n;
        int m_int = (int) m;
        Collections.sort(a);
//        Arrays.sort(arr);
        long min = Long.MAX_VALUE;
        for(int i = 0; i <= n_int-m_int; i++){
            int end = i+m_int-1;
            if(a.get(end) - a.get(i) < min){
                min = a.get(end) - a.get(i);
            }
        }
        return min;
    }
}
