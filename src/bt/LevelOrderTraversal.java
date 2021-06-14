package bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = BinaryTree.tree1();
        ArrayList<Integer> result = levelOrder(root);
        for(Integer e: result)
            System.out.println(e+" ");
    }

    static ArrayList<Integer> levelOrder(Node node)
    {
        // Your code here
        if (node == null)
            return new ArrayList<>(0);
        ArrayList<Integer> order = new ArrayList<>();

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(node);
        while (!deque.isEmpty()) {
            Node currentNode = deque.removeFirst();
            if (currentNode.left != null)
                deque.add(currentNode.left);
            if (currentNode.right != null)
                deque.add(currentNode.right);
            order.add(currentNode.data);
        }
        return order;
    }

}
