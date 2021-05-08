package linkedlist;

public class AddOne {
    public static void main(String[] args) {

        Node node = new Node();
        node.add(4);
        node.add(5);
        node.add(6);

        int carry = 1, sum = 0;
        Node reversedHead = reverse(node.getHead());

        Node temp = reversedHead;
        Node tail = null;

        while (temp != null) {
            sum = carry + temp.data;

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            temp.data = sum;
            if (temp.next == null) {
                tail = temp;
            }
            temp = temp.next;
        }

        if (carry == 1 && tail != null) {
            tail.next = new Node(carry);
        }

        Node head = reverse(reversedHead);
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static Node reverse(Node head){
        if(head == null || head.next == null)
            return head;

        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }
}
