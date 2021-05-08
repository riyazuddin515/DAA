package linkedlist;

public class DetectLoop {
    public static void main(String[] args) {
        Node node = new Node();
        node.add(10);
        node.add(20);
        node.add(30);
        node.add(40);

        Node a = node.getHead();
        Node b = node.getHead();

        boolean flag = false;

        while (a != null && b != null && b.getNext() != null) {
            a = a.getNext();
            b = b.getNext().getNext();
            if (a == b) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
