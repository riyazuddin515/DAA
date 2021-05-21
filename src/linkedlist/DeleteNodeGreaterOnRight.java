package linkedlist;

public class DeleteNodeGreaterOnRight {
    public static void main(String[] args) {
        Node1 head = new Node1(12);
        head.next = new Node1(15);
        head.next.next = new Node1(10);
        head.next.next.next = new Node1(11);
        head.next.next.next.next = new Node1(6);
        head.next.next.next.next.next = new Node1(2);
        head.next.next.next.next.next.next = new Node1(3);

        Node1 temp = divide(head);
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static Node1 divide(Node1 head) {
        if (head == null || head.next == null)
            return head;

        Node1 a = divide(head.next);
        if (head.data < a.data) {
            return a;
        }else {
            head.next = a;
            return head;
        }
    }
}
