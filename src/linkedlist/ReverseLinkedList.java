package linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        for (int i = 1; i < 6; i++) {
            Node node = new Node(i);
            if (head == null){
                head = node;
            }else {
                tail.setNext(node);
            }
            tail = node;
        }

        System.out.println("After");
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }


//        Node result = reverse(head);
        Node result = bReverse(head);
        System.out.println("Before");
        temp = result;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

    }

    private static Node reverse(Node head){
        Node pre = null;
        Node next = null;
        Node current = head;
        while (current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    private static Node bReverse(Node head){
        if(head == null || head.next == null)
            return head;

        Node rest = bReverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }
}
