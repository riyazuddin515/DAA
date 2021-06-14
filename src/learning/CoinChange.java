package learning;

import java.util.HashMap;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(4, new int[]{1, 2, 3}, new HashMap<>(4))); //4
        System.out.println(coinChange(10, new int[]{2, 5, 3, 6}, new HashMap<>(10))); //5
        System.out.println(coinChange(9, new int[]{5, 6, 7, 9, 11, 12, 13, 15}, new HashMap<>(10))); //1
//        System.out.println("<------------------>");
        System.out.println(coinChange1(new int[]{1, 2, 3}, 3, 4, new HashMap<>())); //4
        System.out.println(coinChange1(new int[]{2, 5, 3, 6}, 4, 10, new HashMap<>())); //5
        System.out.println(coinChange1( new int[]{5, 6, 7, 9, 11, 12, 13, 15}, 8, 9, new HashMap<>())); //1

    }

    private static int coinChange(int targetSum, int[] arr, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum == 0)
            return 1;
        if (targetSum < 0)
            return 0;
        int sum = 0;
        for (int e : arr) {
            int reminder = targetSum - e;
            int reminderResult = coinChange(reminder, arr, memo);
            sum = sum + reminderResult;
        }
        memo.put(targetSum, sum);
        return memo.get(targetSum);
    }

    private static int coinChange1(int[] arr, int m, int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n))
            return memo.get(n);
        if (m <= 0 && n >= 0)
            return 0;
        if (n == 0)
            return 1;
        if (n < 1)
            return 0;
        memo.put(n, coinChange1(arr, m - 1, n, memo) + coinChange1(arr, m, n - arr[m - 1], memo));
        return memo.get(n);
    }
}
