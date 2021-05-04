package linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        OwnLinkedList ownLinkedList = new OwnLinkedList();

        for (int i = 1; i < 6; i++) {
            ownLinkedList.add(i);
        }

        System.out.println("After");
        OwnLinkedList temp = ownLinkedList.getHead();
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }


//        Node result = reverse(head);
        OwnLinkedList result = bReverse(OwnLinkedList.head);
        System.out.println("Before");
        temp = result;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

    }

    private static OwnLinkedList reverse(OwnLinkedList head){
        OwnLinkedList pre = null;
        OwnLinkedList next = null;
        OwnLinkedList current = head;
        while (current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    private static OwnLinkedList bReverse(OwnLinkedList head){
        if(head == null || head.next == null)
            return head;

        OwnLinkedList rest = bReverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }
}
