package linkedlist;

public class AddTwoNumbers {

    public static void main(String[] args) {
        Node first = new Node();
        first.add(7);
        first.add(7);
        first.add(0);
        first.add(3);
        first.add(2);
        Node second = new Node();
        second.add(2);
        second.add(9);
        second.add(6);
        second.add(6);
        second.add(0);

        Node firstReverseHead = ReverseLinkedList.bReverse(first.getHead());
        Node secondReverseHead = ReverseLinkedList.bReverse(second.getHead());

        Node firstTemp = firstReverseHead;
        Node secondTemp = secondReverseHead;

        Node result = new Node();

        int carry = 0;
        int sum = 0;
        while (firstTemp != null || secondTemp != null) {

            sum = carry +
                    (firstTemp != null? firstTemp.data : 0) +
                    (secondTemp != null? secondTemp.data : 0);

            carry = (sum >= 10)? 1 : 0;

            sum = sum % 10;
            result.add(sum);

            if (firstTemp != null) {
                firstTemp = firstTemp.next;
            }
            if (secondTemp != null) {
                secondTemp = secondTemp.next;
            }
        }

        if (carry == 1) {
            result.getTail().next = new Node(carry);
        }

        Node temp = result.getHead();
        Node mainHead = ReverseLinkedList.bReverse(temp);
        temp.print(mainHead);
    }

    private static void worstMethod() {
        Node node = new Node();
        node.add(6);
        node.add(3);

        Node node1 = new Node();
        node1.add(7);

        int n = sumOfTheLinkedList(node.getHead());
        int m = sumOfTheLinkedList(node1.getHead());

        int sum = n + m;

        Node result = new Node();
        int temp = sum;

        while (temp > 0) {
            int r = temp % 10;
            result.add(r);
            temp = temp / 10;
        }

        Node head = ReverseLinkedList.bReverse(result.getHead());
        result.print(head);
    }

    private static int sumOfTheLinkedList(Node head) {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum = sum * 10 + temp.data;
            temp = temp.next;
        }
        return sum;
    }
}
