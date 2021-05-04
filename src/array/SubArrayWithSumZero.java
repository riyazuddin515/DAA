package array;

import java.util.HashMap;

public class SubArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, -3, 1, 6};
        int[] arr2 = {4, 2, 0, 1, 6};
        int[] arr3 = {10, -10};
        int[] arr4 = {0, 9, 7, -12, 5};
        System.out.println(subArrayExists(arr1, arr1.length));
        System.out.println(subArrayExists(arr2, arr2.length));
        System.out.println(subArrayExists(arr3, arr3.length));
        System.out.println(subArrayExists(arr4, arr4.length));
    }



    /**
     * use hash map
     * check three conditions
     * 1. if given array contains 0 return true
     * 2. if sum is 0 return true
     * 3. if hash map contains the sum == 1 return true
     *
     * if sum = 4 and after sometime if we get sum = 4 again
     * then update key 4 in hashmap with 1 which mean we have
     * sub array with sum zero in between
     */
    private static boolean subArrayExists1(int[] arr, int n) {
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(!hm.containsKey(sum)){
                hm.put(sum, 0);
            }else{
                hm.put(sum, 1);
            }
            if (sum == 0 || arr[i] == 0 || hm.get(sum) == 1) {
                return true;
            }
        }
        return false;
    }


    /**
     * O(n^2) complexity
     */
    private static boolean subArrayExists(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arr[i];
            if(sum == 0)
                return true;
            for (int j = i+1; j < n; j++) {
                sum += arr[j];
                if(sum == 0)
                    return true;
            }
        }
        return false;
    }
}
