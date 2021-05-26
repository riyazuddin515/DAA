package linkedlist;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SortKSortedDoubleLinkedList {
    public static void main(String[] args) {
        DL head = new DL(3, null);
        head.next = new DL(6, head);
        head.next.next = new DL(2, head.next);
        head.next.next.next = new DL(12, head.next.next);
        head.next.next.next.next = new DL(56, head.next.next.next);
        head.next.next.next.next.next = new DL(8, head.next.next.next.next);

        int k = 2;

        PriorityQueue<DL> priorityQueue = new PriorityQueue<>(new OwnComparator());
        DL temp = head;
        int i = k;
        while (temp != null && i < k + 1) {
            priorityQueue.add(temp);
            temp = temp.next;
            i--;
        }
        Iterator<DL> iterator = priorityQueue.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().data);
    }
}

class OwnComparator implements Comparator<DL>{
    @Override
    public int compare(DL o1, DL o2) {
        return o1.data - o2.data;
    }
}
