package bt;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer> result = reverseLevelOrder(root);
        for (Integer e : result)
            System.out.println(e + " ");
    }

    private static ArrayList<Integer> reverseLevelOrder(Node node) {
        // code here
        if (node == null)
            return new ArrayList<>();
        ArrayList<Integer> order = new ArrayList<>();
        ArrayDeque<Node> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(node);
        while (!arrayDeque.isEmpty()) {
            Node currentNode = arrayDeque.removeFirst();
            if (currentNode.right != null)
                arrayDeque.add(currentNode.right);
            if (currentNode.left != null)
                arrayDeque.add(currentNode.left);
            order.add(0, currentNode.data);
        }
        return order;
    }
}
