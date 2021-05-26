package linkedlist;

public class FindPairInDoubleLinkedList {
    public static void main(String[] args) {
        DL head = new DL(1, null);
        head.next = new DL(2, head);
        head.next.next = new DL(4, head.next);
        head.next.next.next = new DL(5, head.next.next);
        head.next.next.next.next = new DL(6, head.next.next.next);
        head.next.next.next.next.next = new DL(8, head.next.next.next.next);
        head.next.next.next.next.next.next = new DL(9, head.next.next.next.next.next);

        int k = 7;

        DL left = head;
        DL right = head;
        while (right.next != null) {
            right = right.next;
        }

        while (left != right && right.next != left) {
            if (left.data + right.data > k)
                right = right.pre;
            else if (left.data + right.data == k) {
                System.out.println("( "+ right.data+", "+left.data+" )");
                left = left.next;
                right = right.pre;
            }else
                left = left.next;
        }
    }
}
