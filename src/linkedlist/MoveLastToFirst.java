package linkedlist;

public class MoveLastToFirst {
    public static void main(String[] args) {
        Node node = new Node();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);

        Node result = rajeev(node.getHead());
//        OwnLinkedList result = riyaz(ownLinkedList.getHead());
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static Node rajeev(Node head) {
        Node a = head;
        Node b = head;

        b = b.next;

        while (b != null) {
            if (b.next == null) {
                b.next = head;
                a.next = null;
                head = b;
                break;
            }
            a = a.next;
            b = b.next;
        }

        return head;
    }

    private static Node riyaz(Node head) {
        Node temp = head;
        if (temp.next == null)
            return head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
}
