package linkedlist;

public class NthNodeFromEndOfLinkedList {
    public static void main(String[] args) {
        Node1 head = new Node1(1);
//        head.next = new Node1(2);
//        head.next.next = new Node1(3);
//        head.next.next.next = new Node1(4);
//        head.next.next.next.next = new Node1(5);
//        head.next.next.next.next.next = new Node1(6);
//        head.next.next.next.next.next.next = new Node1(7);
//        head.next.next.next.next.next.next.next = new Node1(8);
//        head.next.next.next.next.next.next.next.next = new Node1(9);

        System.out.println(getNthFromLast(head, 1));

    }

    private static int getNthFromLast(Node1 head, int n) {
        // Your code here
        Node1 temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        if (counter - n < 0)
            return -1;

        temp = head;
        for (int i = 0; i < counter - n; i++) {
            temp = temp.next;
        }

        return temp.data;
    }
}
