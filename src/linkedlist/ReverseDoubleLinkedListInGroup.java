package linkedlist;

import java.util.Stack;

public class ReverseDoubleLinkedListInGroup {
    public static void main(String[] args) {
        DL head = new DL(1, null);
        head.next = new DL(2, head);
        head.next.next = new DL(3, head.next);
        head.next.next.next = new DL(4, head.next.next);
        head.next.next.next.next = new DL(5, head.next.next.next);
        head.next.next.next.next.next = new DL(6, head.next.next.next.next);
        head.next.next.next.next.next.next = new DL(7, head.next.next.next.next.next);
        head.next.next.next.next.next.next.next = new DL(8, head.next.next.next.next.next.next);
        head.next.next.next.next.next.next.next.next = new DL(9, head.next.next.next.next.next.next.next);

        DL temp = head;
        DL newHead = null;
        DL newTail = null;
        int k = 3;
        Stack<DL> stack = new Stack<>();
        while (temp != null) {
            while (stack.size() != k && temp != null) {
                stack.add(temp);
                temp = temp.next;
            }

            while (!stack.isEmpty()) {
                if (newHead == null) {
                    newHead = stack.pop();
                    newHead.next = null;
                    newHead.pre = null;
                    newTail = newHead;
                }else {
                    newTail.next = stack.pop();
                    newTail.next.pre = newTail;
                    newTail.next.next = null;
                    newTail = newTail.next;
                }
            }

        }
        temp = newHead;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
