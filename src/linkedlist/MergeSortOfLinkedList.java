package linkedlist;

public class MergeSortOfLinkedList {
    public static void main(String[] args) {
        Node1 list = new Node1(50);
        list.next = new Node1(30);
        list.next.next = new Node1(80);
        list.next.next.next = new Node1(90);
        list.next.next.next.next = new Node1(10);
        list.next.next.next.next.next = new Node1(70);
        list.next.next.next.next.next.next = new Node1(20);
        list.next.next.next.next.next.next.next = new Node1(40);
        list.next.next.next.next.next.next.next.next = new Node1(60);
        list.next.next.next.next.next.next.next.next.next = new Node1(100);

        Node1 sortedList = divide(list);
        while (sortedList != null) {
            System.out.println(sortedList.data);
            sortedList = sortedList.next;
        }
    }

    private static Node1 findMid(Node1 head) {
        Node1 slow = head;
        Node1 fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }
        return slow;
    }

    private static Node1 divide(Node1 head) {

        if (head == null || head.next == null)
            return head;

        Node1 mid = findMid(head);

        Node1 midNext = mid.next;
        mid.next = null;

        Node1 left = divide(head);
        Node1 right = divide(midNext);

        Node1 sortedList = sort(left, right);
        return sortedList;
    }

    public static Node1 sort(Node1 left, Node1 right) {

        if (left == null)
            return right;
        if (right == null)
            return  left;

        Node1 result = null;
        if (left.data <= right.data) {
            result = left;
            result.next = sort(left.next, right);
        }else {
            result = right;
            result.next = sort(left, right.next);
        }

        return result;
    }

}
