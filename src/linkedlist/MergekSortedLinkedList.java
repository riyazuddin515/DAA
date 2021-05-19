package linkedlist;

public class MergekSortedLinkedList {

    public static void main(String[] args) {

        Node1 l1 = new Node1(1);
        l1.next = new Node1(2);
        l1.next.next = new Node1(3);

        Node1 l2 = new Node1(4);
        l2.next = new Node1(5);

        Node1 l3 = new Node1(5);
        l3.next = new Node1(6);

        Node1 l4 = new Node1(7);
        l4.next = new Node1(8);

        Node1[] arr = {l1, l2, l3, l4};

        Node1 result = mergeKList(arr, arr.length);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    static Node1 mergeKList(Node1[] arr, int k) {
        //Add your code here
        int last = k - 1;
        int i, j;
        while (last != 0) {
            i = 0;
            j = last;
            while (i < j) {
                arr[i] = MergeSortOfLinkedList.sort(arr[i], arr[j]);

                i++;
                j--;
            }
            if (i >= j) {
                last = j;
            }
        }
        return arr[0];
    }
}
