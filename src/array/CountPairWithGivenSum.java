package array;

import java.util.HashMap;
import java.util.HashSet;

public class CountPairWithGivenSum {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, 1};
        int n = arr.length;
        int k = 6;
        System.out.print(optimized(arr, n, k));
    }

    private static int optimized(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int a: arr){
            if(!hm.containsKey(a)){
                hm.put(a, 0);
            }
            hm.put(a, hm.get(a)+1);
        }
        for(int a: arr) {
            if (hm.get(k - a) != null) {
                count += hm.get(k - a);
            }
            if(k - a == a)
                count--;
        }
        return count/2;
    }

    private static int brute(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
