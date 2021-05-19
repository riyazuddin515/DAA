package linkedlist;

public class DeletionFromCircularLinkedList {
    public static void main(String[] args) {
        Node1 h = new Node1(2);
//        h.next = new Node1(5);
//        h.next.next = new Node1(7);
//        h.next.next.next = new Node1(8);
//        h.next.next.next.next = new Node1(10);
        h.next = h;

        delete(h, 10);
        System.out.println("apple");
    }

    private static void delete(Node1 head, int key) {

        if (head.next == head && key == head.data) {
            head = null;
            return;
        }
        if (head.next != head && key == head.data) {
            head = head.next;
            return;
        }

        Node1 pre = null;
        Node1 temp = head;
        do {
            pre = temp;
            temp = temp.next;
        } while (temp.data != key);

        pre.next = temp.next;
        temp.next = null;
    }
}
