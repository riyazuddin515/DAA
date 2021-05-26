package linkedlist;

public class CheckLinkedListPalindrome {
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(2);

        boolean flag = true;
        Node head = list;
        Node tail = null;
        while (head != tail) {
            tail = findBeforeTail(head, tail);
            if (tail == head)
                break;
            if (head.data == tail.data) {
                head = head.next;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    private static Node findBeforeTail(Node head, Node tail) {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        return temp;
    }
}
