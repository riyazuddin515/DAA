package backtracking;

import java.util.ArrayList;
import java.util.Comparator;

public class CombinatioSum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(5);

        int b = 16;
        ArrayList<ArrayList<Integer>> allSol =
                solve(arrayList, b, 0, 0, new ArrayList<>(), new ArrayList<>(), 0);
        allSol.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int min = Math.min(o1.size(), o2.size());
                for (int i = 0; i < min; i++) {
                    if (!o1.get(i).equals(o2.get(i))) {
                        return o1.get(i).compareTo(o2.get(i));
                    }
                }
                return (o1.size() <= o2.size()) ? -1 : 1;
            }
        });
        for (ArrayList<Integer> e : allSol) {
            for (Integer i : e)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> arrayList, int b, int i, int sum, ArrayList<Integer> sol, ArrayList<ArrayList<Integer>> allSol, int last) {
        //base condition
        if (sum == b) {
            if (!allSol.contains(sol))
                allSol.add(new ArrayList<>(sol));
            return allSol;
        }
        if (i == arrayList.size()) {
            return allSol;
        }

        //recur
        if (arrayList.get(i) >= last && sum + arrayList.get(i) <= b) {
            sol.add(arrayList.get(i));
            solve(arrayList, b, 0, sum + arrayList.get(i), sol, allSol, (sol.size() - 1 < 0) ? 0 : sol.get(sol.size() - 1));
            sol.remove(sol.size() - 1);
        }

        //else
        return solve(arrayList, b, i + 1, sum, sol, allSol, (sol.size() - 1 < 0) ? 0 : sol.get(sol.size() - 1));

    }

}
