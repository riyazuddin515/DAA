package linkedlist;

public class FindTripletInDoubleLinkedList {
    public static void main(String[] args) {
        DL head = new DL(1, null);
        head.next = new DL(2, head);
        head.next.next = new DL(4, head.next);
        head.next.next.next = new DL(5, head.next.next);
        head.next.next.next.next = new DL(6, head.next.next.next);
        head.next.next.next.next.next = new DL(8, head.next.next.next.next);
        head.next.next.next.next.next.next = new DL(9, head.next.next.next.next.next);

        int k = 17;
        DL main = head;
        DL left = head.next;
        DL tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        DL right = tail;

        while (left != right) {
            if (main.data + left.data + right.data < k) {
                left = left.next;
            } else if (main.data + left.data + right.data == 17) {
                System.out.println("( "+main.data+", "+left.data+", "+right.data+" )");
                main = main.next;
                left = main.next;
                right = right.pre;
            }else {
                right = right.pre;
            }

            if (left == right || right.next == left) {
                main = main.next;
                left = main.next;
                right = tail;
            }
        }
    }
}
