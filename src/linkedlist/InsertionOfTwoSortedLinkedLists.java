package linkedlist;

public class InsertionOfTwoSortedLinkedLists {

    public static void main(String[] args) {

        Node l1 = new Node();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(4);
        l1.add(6);

        Node l2 = new Node();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);

        Node head = null;
        Node tail = null;

        Node temp1 = l1.getHead();
        Node temp2 = l2.getHead();

        while (temp1 != null && temp2 != null) {

            if (temp1.data == temp2.data) {


                    Node node = new Node(temp1.data);
                    if (head == null) {
                        head = node;
                        tail = head;
                    }else {
                        if (tail.data != temp1.data){
                            tail.next = node;
                            tail = tail.next;
                        }
                    }
                    temp1 = temp1.next;
                    temp2 = temp2.next;

            }else if (temp1.data < temp2.data) {
                temp1 = temp1.next;
            }else{
                temp2 = temp2.next;
            }
        }

        head.print(head);
    }
}
