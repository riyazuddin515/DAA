package linkedlist;

public class Flatten {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.bottom = new TreeNode(7);
        head.bottom.bottom = new TreeNode(8);
        head.bottom.bottom.bottom = new TreeNode(30);

        head.next = new TreeNode(10);
        head.next.bottom = new TreeNode(20);

        head.next.next = new TreeNode(19);
        head.next.next.bottom = new TreeNode(22);
        head.next.next.bottom.bottom = new TreeNode(50);

        head.next.next.next = new TreeNode(28);
        head.next.next.next.bottom = new TreeNode(35);
        head.next.next.next.bottom.bottom = new TreeNode(40);
        head.next.next.next.bottom.bottom.bottom = new TreeNode(45);

        TreeNode result = flatten(head);
        while (result != null) {
            System.out.println(result.data);
            result = result.bottom;
        }
    }

    private static TreeNode flatten(TreeNode head) {
        if (head == null || head.next == null)
            return head;

        TreeNode a = flatten(head.next);
        TreeNode sorted = sort(head, a);

        return sorted;
    }

    private static TreeNode sort(TreeNode a, TreeNode b) {

        if (a == null)
            return b;
        if (b == null)
            return a;

        TreeNode result;
        if (a.data <= b.data) {
            result = a;
            result.bottom = sort(a.bottom, b);
        }else {
            result = b;
            result.bottom = sort(a, b.bottom);
        }
        return result;
    }

}

class TreeNode{
    int data;
    TreeNode next;
    TreeNode bottom;

    TreeNode(int data){
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}
