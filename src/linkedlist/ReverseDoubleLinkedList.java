package linkedlist;

public class ReverseDoubleLinkedList {
    public static void main(String[] args) {
        DL head = new DL(3, null);
        head.next = new DL(4, head);
        head.next.next = new DL(5, head.next);

        DL r = divide(head);
        while (r.pre != null) {
            r = r.pre;
        }
        while (r != null) {
            System.out.println(r.data);
            r = r.next;
        }

        DL h1 = head;
        DL tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        while (h1 != tail) {
            int temp = h1.data;
            h1.data = tail.data;
            tail.data = temp;

            if (h1.next == tail && tail.pre == h1)
                break;

            h1 = h1.next;
            tail = tail.pre;
        }
        DL temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static DL divide(DL head) {

        if (head.next == null){
            head.pre = null;
            return head;
        }

        DL a = divide(head.next);

        a.next = head;
        head.pre = a;
        a = a.next;
        head.next = null;

        return a;
    }

}
