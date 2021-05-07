package linkedlist;

public class RemoveDuplicateData {
    public static void main(String[] args) {
        OwnLinkedList ownLinkedList = new OwnLinkedList();
        ownLinkedList.add(2);
        ownLinkedList.add(2);
        ownLinkedList.add(2);
        ownLinkedList.add(4);
        ownLinkedList.add(5);

        OwnLinkedList a = ownLinkedList.getHead();
        OwnLinkedList b = ownLinkedList.getHead();

        while (b.next != null) {
            if (a.data != b.next.data) {
                a.next = b.next;
                if (a != b) {
                    b.next = null;
                }
                a = a.next;
                b =  a;
            }else {
                b = b.next;
            }
        }

        if (a.data == b.data) {
            a.next = null;
        }

        OwnLinkedList temp = ownLinkedList.getHead();
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
