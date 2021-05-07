package linkedlist;

public class MoveLastToFirst {
    public static void main(String[] args) {
        OwnLinkedList ownLinkedList = new OwnLinkedList();
        ownLinkedList.add(1);
        ownLinkedList.add(2);
        ownLinkedList.add(3);
        ownLinkedList.add(4);
        ownLinkedList.add(5);

        OwnLinkedList result = rajeev(ownLinkedList.getHead());
//        OwnLinkedList result = riyaz(ownLinkedList.getHead());
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static OwnLinkedList rajeev(OwnLinkedList head) {
        OwnLinkedList a = head;
        OwnLinkedList b = head;

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

    private static OwnLinkedList riyaz(OwnLinkedList head) {
        OwnLinkedList temp = head;
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
