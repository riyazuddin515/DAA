package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        int n = 5;
        String s = "catsandog";
        List<String> dict = new ArrayList<>();
        dict.add("cats");
        dict.add("cat");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");

        ArrayList<String> result = solve(s, "", dict, new ArrayList<>(), 0, 0, s.length());
        for (String e : result) {
            System.out.println(e);
        }
    }

    private static List<String> wordBreak(int n, List<String> dict, String s) {
        // code here
        return solve(s, "", dict, new ArrayList<>(), 0, 0, s.length());
    }

    private static ArrayList<String> solve(String s, String sol, List<String> dict, ArrayList<String> result, int i, int j, int stringLength) {
        //Base Condition

        if (j == stringLength) {
            if (dict.contains(s.substring(i, j)))
                result.add(sol + s.substring(i, j));
            return result;
        }
        //recurr
        if (canPlace(s, i, j, dict, stringLength)) {
            solve(s, sol + s.substring(i, j + 1) + " ", dict, result, j + 1, j + 1, stringLength);
        }

        //else
        return solve(s, sol, dict, result, i, j + 1, stringLength);
    }

    private static boolean canPlace(String s, int i, int j, List<String> dict, int stringLength) {
        if (j == stringLength - 1)
            return false;
        return dict.contains(s.substring(i, j + 1));
    }
}
