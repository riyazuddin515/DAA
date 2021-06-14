package dp;

public class FriendsPair {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return  0;
        return solve(n - 1);
    }
}
