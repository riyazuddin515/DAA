package linkedlist;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        linkedList.remove(2);
        linkedList.set(1,90);

        for(int e: linkedList)
            System.out.println(e+" ");
    }
}
