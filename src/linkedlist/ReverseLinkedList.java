package linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {

        Node node = new Node();

        for (int i = 1; i < 6; i++) {
            node.add(i);
        }

        System.out.println("After");
        Node temp = node.getHead();
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }


//        Node result = reverse(head);
        Node result = bReverse(node.getHead());
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

    public static Node bReverse(Node head){
        if(head == null || head.next == null)
            return head;

        Node rest = bReverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }
}
