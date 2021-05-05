package linkedlist;

public class DetectLoop {
    public static void main(String[] args) {
        OwnLinkedList ownLinkedList = new OwnLinkedList();
        ownLinkedList.add(10);
        ownLinkedList.add(20);
        ownLinkedList.add(30);
        ownLinkedList.add(40);

        OwnLinkedList a = ownLinkedList.getHead();
        OwnLinkedList b = ownLinkedList.getHead();

        boolean flag = false;

        while (a != null && b != null && b.getNext() != null) {
            a = a.getNext();
            b = b.getNext().getNext();
            if (a == b) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
