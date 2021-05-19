package linkedlist;

public class MiddleNode {
    public static void main(String[] args) {

        Node l1 = new Node();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        Node result = middleNode(l1.getHead());
        System.out.println(result.data);
    }

    private static Node middleNode(Node head) {
        Node temp = head;
        int a = 0;
        while (temp != null) {
            temp = temp.next;
            a++;
        }

        temp = head;
        int mid = a / 2;
        while (mid >= 1) {
            temp = temp.next;
            mid--;
        }
        return temp;
    }
}
