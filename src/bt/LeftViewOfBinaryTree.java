package bt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeftViewOfBinaryTree {
    public static void main(String[] args) {
        Node root = BinaryTree.tree1();
        Node root1 = BinaryTree.tree4();
        ArrayList<Integer> result = leftView(root);
        BinaryTree.print(result);
        System.out.println();
        result = leftView(root1);
        BinaryTree.print(result);
    }

    private static ArrayList<Integer> leftView(Node root) {
        if (root == null)
            return new ArrayList<>(0);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
                if (i == 1)
                    arrayList.add(temp.data);

                if (temp.right != null)
                    queue.add(temp.right);
                if (temp.left != null)
                    queue.add(temp.left);
            }

        }
        return arrayList;
    }

}
