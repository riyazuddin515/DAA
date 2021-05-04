package string;

import java.util.Arrays;

public class SmallestDistinctWindow {
    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.println(findSubString(str));
    }

    private static String findSubString(String str) {
        // Your code goes here
        int n = str.length();

        int dist_count = 0;

        boolean[] visited = new boolean[256];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (!visited[str.charAt(i)]) {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }

        int start = 0, start_index = -1, minLen = Integer.MAX_VALUE;

        int count = 0;
        int[] curr_count = new int[256];
        for (int i = 0; i < n; i++) {
            curr_count[str.charAt(i)]++;

            if (curr_count[str.charAt(i)] == 1)
                count++;

            if (count == dist_count) {
                while (curr_count[str.charAt(start)] > 1) {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }
                int lenWindow = i - start + 1;
                if (minLen > lenWindow) {
                    minLen = lenWindow;
                    start_index = start;
                }
            }
        }
        return str.substring(start_index, start_index + minLen);
    }
}
