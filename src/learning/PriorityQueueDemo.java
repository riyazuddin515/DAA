package learning;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(5, Collections.reverseOrder());
        pq.add(7);
        pq.add(10);
        pq.add(4);
        pq.add(3);
        pq.add(20);
        pq.add(15);

        for (Integer integer : pq) System.out.print(integer + " ");
    }
}
