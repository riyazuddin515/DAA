package array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthMin {
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 55, 5, 0, 19, 8, 9};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k < arr.length) {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for (int a : arr) {
                pq.add(a);
            }
            int i = 1;
            while (!pq.isEmpty()) {
                if(i == k){
                    System.out.print("kth(" + k + ") min = " + pq.peek());
                    break;
                }
                pq.poll();
                i++;
            }
        }

    }
}
