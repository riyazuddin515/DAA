package linkedlist;

public class RemoveLoop {
    public static void main(String[] args) {
        OwnLinkedList ownLinkedList = new OwnLinkedList();
        ownLinkedList.makeLoop(10, 0);

        OwnLinkedList a = ownLinkedList.getHead();
        OwnLinkedList b = ownLinkedList.getHead();

        while (a != null && b != null && b.getNext() != null) {
            a = a.getNext();
            b = b.getNext().getNext();
            if (a == b) {
                break;
            }
        }

        if (a == b && a.next != null) {
            if (a == ownLinkedList.getHead()) {
                b = b.next;
                while (a != b.next) {
                    b = b.next;
                }
            }else {
                a = ownLinkedList.getHead();
                while (a.next != b.next) {
                    a = a.next;
                    b = b.next;
                }

            }
            b.next = null; /* remove loop */
        }

        OwnLinkedList temp = ownLinkedList.getHead();
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}
