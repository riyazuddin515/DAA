package linkedlist;

public class SplitCircularLinkedList {
    public static void main(String[] args) {
        Node1 h = new Node1(2);
        h.next = new Node1(6);
        h.next.next = new Node1(1);
        h.next.next.next = new Node1(5);
        h.next.next.next.next = h;

        th(h);
    }

    private static void test(Node1 head) {
        Node1 h1 = head, h2 = null, tail = null;
        int counter = 0;
        Node1 temp = head;
        do {
            counter++;
            if (temp.next == head) {
                tail = temp;
            }
            temp = temp.next;
        }while (temp != head);

        temp = head;
        int mid = counter / 2;
        if (counter % 2 == 0) {
            mid = mid - 1;
        }
        while (mid != 0) {
            mid--;
            temp = temp.next;
        }
        h2 = temp.next;
        tail.next = h2;
        temp.next = h1;

        System.out.println("Circular Linked List 1");
        temp = h1;
        while (temp.next != h1) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println("Circular Linked List 2");
        temp = h2;
        if (temp.next == h2) {
            System.out.println(temp.data);
        }else {
            while (temp.next != h2) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    private static void th(Node1 head) {

        Node1 h2 = null;
        Node1 h1 = head;

        Node1 fast = head;
        Node1 slow = head;

        while (fast.next != head && fast.next.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next.next == head) {
            fast = fast.next;
        }

        h2 = slow.next;
        fast.next = h2;

        slow.next = h1;

        Node1 temp = h1;
        System.out.println("Circular Linked List 1");
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }while (temp != h1);
        temp = h2;
        System.out.println("Circular Linked List 1");
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }while (temp != h2);

    }
}
