package linkedlist;

public class QuickSortForLinkedList {
    static Node1 mainHead = null;
    public static void main(String[] args) {


        Node1 head = new Node1(7);
        head.next = new Node1(2);
        head.next.next = new Node1(1);
        head.next.next.next = new Node1(6);
        head.next.next.next.next = new Node1(8);
        head.next.next.next.next.next = new Node1(5);
        head.next.next.next.next.next.next = new Node1(3);
        head.next.next.next.next.next.next.next = new Node1(4);

        mainHead = head;

        Node1 temp = head;
        Node1 tail = null;
        while (temp != null) {
            if (temp.next == null)
                tail = temp;
            temp = temp.next;
        }

        quickSort(head, tail);
        Node1 resultantHead = mainHead;
        while (resultantHead != null) {
            System.out.println(resultantHead.data);
            resultantHead = resultantHead.next;
        }
    }

    private static Node1 findNodeBeforePivotPivotPoint(Node1 head, Node1 pivotPoint) {
        if (head == pivotPoint)
            return head;
        Node1 temp = head;
        while (temp.next != pivotPoint) {
            temp = temp.next;
        }
        return temp;
    }

    private static void quickSort(Node1 head, Node1 tail) {

        if (head == null || head == tail || tail.next == head) {
            return;
        }

        Node1 pivotPoint = partition(head, tail);
        Node1 beforePivot = findNodeBeforePivotPivotPoint(head, pivotPoint);
        quickSort(head, beforePivot);
        quickSort(pivotPoint.next, tail);

    }

    private static Node1 partition(Node1 head, Node1 tail) {
        Node1 start = head;
        Node1 pivotIndex = head;

        while (start != tail) {
            if (start.data <= tail.data) {
                swap(start, pivotIndex);
                pivotIndex = pivotIndex.next;
            }
            start = start.next;
        }
        swap(tail, pivotIndex);
        return pivotIndex;
    }

    private static void swap(Node1 a, Node1 b) {
        if (a == b)
            return;
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }


}
