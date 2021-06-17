package bt;

import linkedlist.DL;

public class BinaryTreeToDoubleLinkedList {

    public static void main(String[] args) {
        Node root1 = BinaryTree.tree4();
//        t(root1);
        Test test = new Test();
        test.inOrderRecur(root1);
        Node temp = test.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.right;
        }
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp.right != head){
            System.out.println(temp.data);
            temp = temp.right;
        }
        System.out.println(temp.data);
    }

    private static void t(Node root) {
        Node head = recur(root);
        Node temp = head;
        while (temp.right != null){
            temp = temp.right;
        }
        temp.right = head;
        head.left = temp;
        print(head);
    }

    private static Node recur(Node root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            return new Node(root.data);

        Node leftNode = recur(root.left);
        Node rightNode = recur(root.right);

        Node current = new Node(root.data);
        if (leftNode == null){
            leftNode = current;
            current.right = rightNode;
            if (rightNode != null)
                rightNode.left = current;
        }else {
            Node leftTail = leftNode;
            while (leftTail.right != null)
                leftTail = leftTail.right;

            leftTail.right = current;
            current.left = leftTail;
            current.right = rightNode;
        }
        if (rightNode != null)
            rightNode.left = current;

        return leftNode;
    }

}

class Test{
    Node head;
    Node tail;
    protected Node inOrderRecur(Node root) {
        if (root == null) {
            return null;
        }
        inOrderRecur(root.left);
        if (head == null) {
            head = new Node(root.data);
            tail = head;
        }
        else {
            Node cur = new Node(root.data);
            tail.right = cur;
            cur.left = tail;
            tail = cur;
        }
        inOrderRecur(root.right);
        return head;
    }
}

