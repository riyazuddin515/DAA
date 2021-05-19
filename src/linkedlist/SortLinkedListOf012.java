package linkedlist;

public class SortLinkedListOf012 {
    public static void main(String[] args) {
        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(2);
        head.next.next.next = new Node1(1);
        head.next.next.next.next = new Node1(2);
        head.next.next.next.next.next = new Node1(0);
        head.next.next.next.next.next.next = new Node1(2);
        head.next.next.next.next.next.next.next = new Node1(2);

        int counter0 = 0, counter1 = 0, counter2 = 0;
        Node1 temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                counter0++;
            }else if (temp.data == 1) {
                counter1++;
            }else if (temp.data == 2){
                counter2++;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (counter0 != 0) {
                temp.data = 0;
                counter0--;
            } else if (counter1 != 0) {
                temp.data = 1;
                counter1--;
            }else if (counter2 != 0){
                temp.data = 2;
                counter2--;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
