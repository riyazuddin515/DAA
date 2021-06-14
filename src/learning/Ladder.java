package learning;

import java.util.Arrays;

public class Ladder {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        System.out.println(solve(n));
        int[] temp = new int[n + 1];
        Arrays.fill(temp, -1);
        System.out.println(topDownDp(n, temp));
        System.out.println(bottomUp(n, k));
    }

    private static int solve(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        return solve(n - 1) + solve(n - 2) + solve(n - 3);
    }

    private static int topDownDp(int n, int[] temp) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (temp[n] != -1)
            return temp[n];
        int ans = topDownDp(n - 1, temp) + topDownDp(n - 2, temp) + topDownDp(n - 3, temp);
        temp[n] = ans;
        return ans;
    }

    private static int bottomUp(int n, int maxJumps) {
        int[] temp = new int[n + 1];
        temp[0] = 1;
        for (int i = 1; i <= 4; i++) {
            int way = 0;
            for (int j = 1; j <= maxJumps && i - j >= 0; j++) {
                way += temp[i - j];
            }
            temp[i] = way;
        }
        return temp[n];
    }
}
