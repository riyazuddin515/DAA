package linkedlist;

public class Node {

    private Node head = null;
    private Node tail = null;

    int data;
    Node next;

    Node(){ }
    Node(int data){
        this.data = data;
    }

    public void add(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }else {
            tail.setNext(node);
        }
        tail = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void makeLoop(int data, int index){
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        }else {
            tail.setNext(node);
            tail = tail.getNext();
            Node temp = head;
            int counter = 0;
            while (temp != null){
                if (counter == index){
                    tail.setNext(temp);
                    break;
                }
                counter++;
                temp = temp.getNext();
            }
        }
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
