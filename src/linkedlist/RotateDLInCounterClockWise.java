package linkedlist;

public class RotateDLInCounterClockWise {
    public static void main(String[] args) {
        DoubleNode head = new DoubleNode(1, null);
        head.next = new DoubleNode(2, head);
        head.next.next = new DoubleNode(3, head.next);
        head.next.next.next = new DoubleNode(4, head.next.next);
        head.next.next.next.next = new DoubleNode(5, head.next.next.next);

        int k = 2;
        int counter = 0;
        DoubleNode tail = head;
        while (tail.next != null) {
            counter++;
            tail = tail.next;
        }

        head = rotate(counter, k, head, tail);
        print(head);

    }

    private static DoubleNode rotate(int counter, int k, DoubleNode head, DoubleNode tail) {
        if (counter - k >= 0) {
            DoubleNode temp = head;
            while (k != 1) {
                k--;
                temp = temp.next;
            }
            tail.next = head;
            head.pre = tail;
            head = temp.next;
            head.pre = null;
            temp.next = null;
        }
        return head;
    }

    private static void print(DoubleNode head) {
        DoubleNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class DoubleNode{
    int data;
    DoubleNode next, pre;

    DoubleNode(int data, DoubleNode pre) {
        this.data =  data;
        this.pre = pre;
    }
}
