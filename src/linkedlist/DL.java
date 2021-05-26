package linkedlist;

public class DL {
    public int data;
    public DL next, pre;

    public DL(int data, DL pre) {
        this.data = data;
        this.next = null;
        this.pre = pre;
    }
}
