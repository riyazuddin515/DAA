package learning;

import linkedlist.DL;
import linkedlist.DemoLinkedList;

public class FindPairDL {
    public static void main(String[] args) {
        DL head = new DL(1, null);
        head.next = new DL(2, head);
        head.next.next = new DL(4, head.next);
        head.next.next.next = new DL(5, head.next.next);
        head.next.next.next.next = new DL(6, head.next.next.next);
        head.next.next.next.next.next = new DL(8, head.next.next.next.next);
        head.next.next.next.next.next.next = new DL(9, head.next.next.next.next.next);

        findPaid(head, 7);
    }

    private static void findPaid(DL head, int k) {
        if (head == null || head.next == null)
            return;

        DL a = head;
        DL b = head;

        while (a != null) {

            b = b.next;

            if (b == null){
                a = a.next;
                b = a;
            }
            else {
                if (a.data + b.data > k) {
                    a = a.next;
                    b = a;
                }else if (a.data + b.data == k){
                    System.out.println("( "+a.data+", "+b.data+" )");
                }
            }

        }
    }
}
