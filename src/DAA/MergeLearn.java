package DAA;

public class MergeLearn {
    public static void main(String[] args) {
        Node list = new Node();
        list.add(50);
        list.add(30);
        list.add(80);
        list.add(90);
        list.add(10);
        list.add(70);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(100);

        Node r = divide(list.head);
        while (r != null) {
            System.out.println(r.data);
            r = r.next;
        }
    }

    private static Node findMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        if (head != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                if (fast != null) {
                    slow = slow.next;
                }
            }
        }
        return slow;
    }

    private static Node divide(Node head) {

        if (head == null || head.next == null)
            return head;

        Node mid = findMiddleNode(head);

        Node nextToMid = mid.next;
        mid.next = null;

        Node left = divide(head);
        Node right = divide(nextToMid);

        Node sortedList = sort(left, right);
        return sortedList;
    }

    private static Node sort(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node result = null;
        if (a.data <= b.data) {
            result = a;
            result.next = sort(a.next, b);
        }else {
            result = b;
            result.next = sort(a, b.next);
        }
        return result;
    }
}
class Node {

    public static Node head;
    protected static Node tail;

    int data;
    Node next;

    Node() {

    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    protected void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        }else {
            tail.next = node;
            tail = tail.next;
        }
    }
}
