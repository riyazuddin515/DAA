package leetcode.dp;

import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("<---Recursive O(n) space---->");
        System.out.println(climb(0, new HashMap<>()));
        System.out.println(climb(1, new HashMap<>()));
        System.out.println(climb(2, new HashMap<>()));
        System.out.println(climb(3, new HashMap<>()));
        System.out.println(climb(5, new HashMap<>()));
        System.out.println(climb(7, new HashMap<>()));
        System.out.println(climb(45, new HashMap<>()));
        System.out.println("<---Iterative O(n) space---->");
        System.out.println(bottomUpClimb(2));
        System.out.println(bottomUpClimb(3));
        System.out.println(bottomUpClimb(5));
        System.out.println(bottomUpClimb(7));
        System.out.println(bottomUpClimb(45));
        System.out.println("<---Iterative O(1) space---->");
        System.out.println(bottomUpClimbConstantSpace(2));
        System.out.println(bottomUpClimbConstantSpace(3));
        System.out.println(bottomUpClimbConstantSpace(5));
        System.out.println(bottomUpClimbConstantSpace(7));
        System.out.println(bottomUpClimbConstantSpace(45));
    }

    private static int climb(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n))
            return memo.get(n);
        if (n == 0 || n == 1)
            return 1;
        if (n < 0)
            return 0;
        memo.put(n, climb(n - 1, memo) + climb(n - 2, memo));
        return memo.get(n);
    }

    private static int bottomUpClimb(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    private static int bottomUpClimbConstantSpace(int n) {
        if (n == 1)
            return 1;
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
