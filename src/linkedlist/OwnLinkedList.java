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

    public void makeLoop(int data, int index){
        OwnLinkedList ownLinkedList = new OwnLinkedList(data);
        if (tail != null) {
            tail.setNext(ownLinkedList);
            tail = tail.getNext();
            OwnLinkedList temp = head;
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

}
