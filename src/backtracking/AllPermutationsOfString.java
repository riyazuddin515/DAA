package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllPermutationsOfString {
    static int counter = 0;

    public static void main(String[] args) {
        String s = "ljrk";
        List<String> list = permutations(s, "", new ArrayList<>(),0, new boolean[s.length()]);
        Collections.sort(list);
        for (String e: list)
            System.out.println(e);
    }

    private static List<String> permutations(String s, String sol,ArrayList<String> allSolutions, int i, boolean[] visited) {
        //Base

        if (sol.length() == s.length()) {
            allSolutions.add(sol);
            return allSolutions;
        }

        if (i >= s.length())
            return allSolutions;

        if (!visited[i]) {
            visited[i] = true;
            permutations(s, sol + s.charAt(i), allSolutions, 0, visited);
            visited[i] = false;
        }

        permutations(s, sol, allSolutions, i + 1, visited);

        return allSolutions;
    }
}
