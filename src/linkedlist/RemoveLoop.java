package linkedlist;

public class RemoveLoop {
    public static void main(String[] args) {
        Node node = new Node();
        node.makeLoop(10, 0);

        Node a = node.getHead();
        Node b = node.getHead();

        while (a != null && b != null && b.getNext() != null) {
            a = a.getNext();
            b = b.getNext().getNext();
            if (a == b) {
                break;
            }
        }

        if (a == b && a.next != null) {
            if (a == node.getHead()) {
                b = b.next;
                while (a != b.next) {
                    b = b.next;
                }
            }else {
                a = node.getHead();
                while (a.next != b.next) {
                    a = a.next;
                    b = b.next;
                }

            }
            b.next = null; /* remove loop */
        }

        Node temp = node.getHead();
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}
