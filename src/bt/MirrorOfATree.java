package bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.SortedMap;

public class MirrorOfATree {
    public static void main(String[] args) {
        Node root = BinaryTree.tree1();

        System.out.println("Level Order");
        BinaryTree.print(LevelOrderTraversal.levelOrder(root));

        System.out.println();
        System.out.println("Mirror Level Order");
        BinaryTree.print(mirror(root));

    }

    private static ArrayList<Integer> mirror(Node root) {
        if (root == null)
            return new ArrayList<>(0);

        ArrayList<Integer> mirrorList = new ArrayList<>();
        ArrayDeque<Node> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(root);
        while (!arrayDeque.isEmpty()) {
            Node currentNode = arrayDeque.removeFirst();
            Node left = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = left;
            if (currentNode.left != null)
                arrayDeque.add(currentNode.left);
            if (currentNode.right != null)
                arrayDeque.add(currentNode.right);
            mirrorList.add(currentNode.data);
        }
        return mirrorList;
    }
}
