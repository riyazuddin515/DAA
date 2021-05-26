package linkedlist;

public class CloneLinkedListHavingArb {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node.addArbPointer(head, head.next.next);
        Node.addArbPointer(head.next, head);
        Node.addArbPointer(head.next.next, head.next.next.next.next);
        Node.addArbPointer(head.next.next.next, head.next.next);
        Node.addArbPointer(head.next.next.next.next, head.next);

        Node temp = head;
        while (temp != null) {
            Node n = new Node(temp.data);
            n.next = temp.next;
            temp.next = n;
            temp = n.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.arb != null) {
                temp.next.arb = temp.arb.next;
            }
            temp = temp.next.next;
        }
        Node oldTail = head;
        Node newHead = head.next;
        Node newTail = newHead;
        while (newTail.next != null) {
            oldTail.next = newTail.next;
            oldTail = oldTail.next;
            newTail.next = oldTail.next;
            newTail = newTail.next;
        }
        oldTail.next = null;

        temp = newHead;
        while (temp != null) {
            if (temp.arb != null)
                System.out.println(temp.data + "-->" + temp.arb.data);
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;
        Node arb;

        Node(int data) {
            this.data = data;
        }

        static void addArbPointer(Node a, Node b) {
            a.arb = b;
        }
    }
}

