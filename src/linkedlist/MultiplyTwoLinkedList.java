package linkedlist;

public class MultiplyTwoLinkedList {
    public static void main(String[] args) {
        Node1 h1 = new Node1(1);
        h1.next = new Node1(0);
        h1.next.next = new Node1(0);

        Node1 h2 = new Node1(1);
        h2.next = new Node1(0);

        long a = 0;
        long b = 0;

        Node1 temp = h1;
        while (temp != null) {
            a = (a * 10) + temp.data;
            temp = temp.next;
        }
        temp = h2;
        while (temp != null) {
            b = (b * 10) + temp.data;
            temp = temp.next;
        }

        System.out.println(a * b);
    }
}
