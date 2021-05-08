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

        Node node1 = new Node();
        node1.add(2);
        node1.add(2);
        node1.add(4);
        node1.add(5);
        node1.add(2);
        node1.add(2);
        unSorted(node1);
    }

    private static void sorted(Node node) {
        Node a = node.getHead();
        Node b = node.getHead();

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

        Node temp = node.getHead();
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void unSorted(Node node) {

        if (node.getHead() == null)
            return;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Node temp = node.getHead();
        while (temp != null) {
            if (!hashMap.containsKey(temp.data)){
                hashMap.put(temp.data, 0);
            }
            temp = temp.next;
        }

        Node a = node.getHead();
        Node b = node.getHead();

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

        temp = node.getHead();
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
