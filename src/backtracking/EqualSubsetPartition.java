package backtracking;

public class EqualSubsetPartition {
    public static void main(String[] args) {
        int[] arr = {478, 757, 314, 471, 729, 100, 459, 618};
        int n = arr.length;
        boolean result = solve(arr, 0, new boolean[n], new int[n], new int[n], 0, 0, 0, 0);
        System.out.println(result);
    }

    private static boolean solve(int[] arr, int i, boolean[] visited, int[] left, int[] right, int le, int re, int ls, int rs) {
        //Base condition

        if (i == arr.length && ls == rs && ls != 0 && le+re == arr.length) {
            for (int e : left)
                System.out.print(e + " ");
            System.out.println();
            for (int e : right)
                System.out.print(e + " ");
            System.out.println();
            return true;
        }

        if (i == arr.length) {
            return false;
        }

        //recur
        if (!visited[i]) {
            visited[i] = true;

            if (ls < rs || ls == rs) {
                left[le] = arr[i];
                le = le + 1;
                ls = ls + arr[i];

                if (!solve(arr, 0, visited, left, right, le, re, ls, rs)) {
                    ls = ls - arr[i];
                    le = le - 1;
                    left[le] = 0;
                    visited[i] = false;
                } else
                    return true;

            } else {
                right[re] = arr[i];
                re = re + 1;
                rs = rs + arr[i];

                if (!solve(arr, 0, visited, left, right, le, re, ls, rs)) {
                    rs = rs - arr[i];
                    re = re - 1;
                    right[re] = 0;
                    visited[i] = false;
                } else
                    return true;


            }
        }
        //else
        return solve(arr, i + 1, visited, left, right, le, re, ls, rs);
    }
}
