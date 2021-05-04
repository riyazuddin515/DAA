package array;

import java.util.*;

public class MinimunJumpToReachEnd {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
//        System.out.print(n2(arr, arr.length));
        System.out.print(n(arr, arr.length));
    }

    public static int n(int[] arr, int n){
        int maxR = arr[0];
        int steps = arr[0];
        int total_jumps = 1;
        if(n == 1)
            return 0;
        else if(arr[0] == 0)
            return -1;
        else{
            for (int i = 1; i < n; i++) {
                if(i == n-1)
                    return total_jumps;
                maxR = Math.max(maxR, i+arr[i]);
                steps--;
                if (steps == 0) {
                    total_jumps++;
                    if(i >= maxR){
                        return -1;
                    }
                    steps = maxR - i;
                }
            }
        }
        return -5;
    }

    public static int n2(int[] arr, int n){
        int[] ja = new int[n];
        for(int i = 0; i < n; i++)
            ja[i] = Integer.MAX_VALUE;
        ja[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (ja[j] != Integer.MAX_VALUE && arr[j]+j >= i) {
                    if(ja[j]+1 < ja[i]){
                        ja[i] = ja[j] + 1;
                    }
                }
            }
        }
        if(ja[n-1] != Integer.MAX_VALUE)
            return ja[n - 1];
        else
            return -1;
    }
}
