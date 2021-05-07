package linkedlist;

import java.util.HashMap;

public class RemoveDuplicateData {
    public static void main(String[] args) {
//        OwnLinkedList ownLinkedList = new OwnLinkedList();
//        ownLinkedList.add(2);
//        ownLinkedList.add(2);
//        ownLinkedList.add(2);
//        ownLinkedList.add(4);
//        ownLinkedList.add(5);
//
//        sorted(ownLinkedList);

        OwnLinkedList ownLinkedList1 = new OwnLinkedList();
        ownLinkedList1.add(2);
        ownLinkedList1.add(2);
        ownLinkedList1.add(4);
        ownLinkedList1.add(5);
        ownLinkedList1.add(2);
        ownLinkedList1.add(2);
        unSorted(ownLinkedList1);
    }

    private static void sorted(OwnLinkedList ownLinkedList) {
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

    private static void unSorted(OwnLinkedList ownLinkedList) {

        if (ownLinkedList.getHead() == null)
            return;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        OwnLinkedList temp = ownLinkedList.getHead();
        while (temp != null) {
            if (!hashMap.containsKey(temp.data)){
                hashMap.put(temp.data, 0);
            }
            temp = temp.next;
        }

        OwnLinkedList a = ownLinkedList.getHead();
        OwnLinkedList b = ownLinkedList.getHead();

        hashMap.put(a.data, 1);
        //////////////////
        b = b.next;
        a.next = null;
        while (b != null) {
            if (hashMap.get(b.data) == 0) {
                hashMap.put(b.data, 1);
                a.next = b;
                a = b;
            } else if (b.next == null) {
                a.next = null;
            }
            b = b.next;
        }

        temp = ownLinkedList.getHead();
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
