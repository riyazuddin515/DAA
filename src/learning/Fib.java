package learning;

import java.util.HashMap;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(4, new HashMap<>()));
        System.out.println(fib(5, new HashMap<>()));
        System.out.println(fib(8, new HashMap<>()));
        System.out.println(fib(40, new HashMap<>()));
    }

    private static int fib(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n))
            return memo.get(n);
        if (n <= 1)
            return n;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo)) ;
        return memo.get(n);
    }
}
