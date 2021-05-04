package array;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;
        int n = 10;
        System.out.print(getMinDiff(arr, n, k));
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] + k, largest = arr[n-1]-k;
        for(int i = 0; i < n-1; i++){
            int min = Math.min(smallest, arr[i+1]-k);
            int max = Math.max(largest, arr[i]+k);
            if(min < 0)
                continue;
            ans = Math.min(ans, max-min);
        }
        PrintArray.printArray(arr);
        return ans;
    }
}