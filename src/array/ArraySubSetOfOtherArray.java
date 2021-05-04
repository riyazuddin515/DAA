package array;

import java.util.HashSet;

public class ArraySubSetOfOtherArray {
    public static void main(String[] args){
        int[] a1 = {11, 1, 13, 21, 3, 7};
        int[] a2 = {11, 3, 7, 1};

        int[] a11 = {1, 2, 3, 4, 5, 6};
        int[] a22 = {1, 2, 4};

        int[] a111 = {10, 5, 2, 23, 19};
        int[] a222 = {19, 5, 3};

        System.out.println(check(a1, a2, a1.length, a2.length));
        System.out.println(check(a11, a22, a11.length, a22.length));
        System.out.println(check(a111, a222, a111.length, a222.length));
    }
    private static boolean check(int[] a1, int[] a2, int n, int m){
        if(m > n)
            return false;
        HashSet<Integer> hs = new HashSet<>();
        for(int i: a1){
            hs.add(i);
        }
        for(int i: a2){
            if(!hs.contains(i)){
                return false;
            }
        }
        return true;
    }
}
