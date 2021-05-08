package linkedlist;

import java.util.Stack;

public class ReverseInGroup {

    public static void main(String[] args) {

        int k = 1;

        Node node = new Node();
        node.add(1);

        Node temp = node.getHead();
        System.out.println("After");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        Stack<Node> stack = new Stack<>();

        Node h = null;
        Node t = null;

        temp = node.getHead();
        while (temp != null || !stack.isEmpty()){
            if (stack.size() < k && temp != null) {
                stack.add(temp);
                temp = temp.getNext();
            }else {
                while (!stack.isEmpty()){
                    if (h == null){
                        h = stack.pop();
                        t = h;
                    }else {
                        t.setNext(stack.pop());
                        t = t.getNext();
                    }
                }
            }
        }
        t.next = null;
        temp = h;
        System.out.println("Before");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
