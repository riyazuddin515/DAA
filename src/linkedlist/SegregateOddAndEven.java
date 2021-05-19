package linkedlist;

public class SegregateOddAndEven {
    public static void main(String[] args) {
        Node1 h = new Node1(6);

        Node1 result = segregate(h);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static Node1 segregate(Node1 h) {
        Node1 evenHead = null, evenTail = null;
        Node1 oddHead = null, oddTail = null;

        Node1 temp = h;
        while (temp != null) {
            Node1 node = new Node1(temp.data);
            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = node;
                    evenTail = node;
                }else {
                    evenTail.next = node;
                    evenTail = evenTail.next;
                }
            }else {
                if (oddHead == null) {
                    oddHead = node;
                    oddTail = node;
                }else {
                    oddTail.next = node;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }
        if (evenTail == null)
            return oddHead;

        evenTail.next = oddHead;
        return evenHead;
    }
}
