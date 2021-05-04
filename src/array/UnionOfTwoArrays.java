package array;


import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for(int i = 0; i < m; i++)
            b[i] = scanner.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        int maxLength = Math.max(n, m);
        for (int i = 0; i < maxLength; i++) {
            if(i < n)
                hs.add(a[i]);
            if(i < m)
                hs.add(b[i]);
        }
        System.out.print(hs.size());
    }
}
