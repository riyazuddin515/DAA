package linkedlist;

public class OwnLinkedList {

    static OwnLinkedList head = null;
    static OwnLinkedList tail = null;

    int data;
    OwnLinkedList next;

    OwnLinkedList(){

    }

    OwnLinkedList(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public OwnLinkedList getNext() {
        return next;
    }

    public void setNext(OwnLinkedList next) {
        this.next = next;
    }

    public void add(int data){
        OwnLinkedList node = new OwnLinkedList(data);
        if (head == null){
            head = node;
        }else {
            tail.setNext(node);
        }
        tail = node;
    }

    public OwnLinkedList getHead() {
        return head;
    }

    public OwnLinkedList getTail() {
        return tail;
    }


}
