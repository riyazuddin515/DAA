package leetcode.dp;

public class MaxSubArray {
    public static void main(String[] args) {

    }

    private static int recur(int[] arr, int start) {

        if (start == arr.length - 1)
            return arr[start];

        int sum = arr[start];
        for (int i = start; i < arr.length; i++) {
            int result = recur(arr, i + 1);
            if (sum + result > sum) {
                sum = sum + result;
            }
        }

        return sum;
    }
}
