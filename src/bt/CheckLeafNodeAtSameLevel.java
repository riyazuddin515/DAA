package bt;

import java.util.LinkedList;
import java.util.Queue;

public class CheckLeafNodeAtSameLevel {
    public static void main(String[] args) {
        String str = "10 20 30 10 10";
        Node root = BinaryTree.buildTree(str);
        System.out.println(check(root));

        String str1 = "3 1 2";
        Node root1 = BinaryTree.buildTree(str1);
        System.out.println(check(root1));
    }

    private static boolean check(Node root) {
        if (root == null)
            return false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int result = Integer.MIN_VALUE;
        int level = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                    if (cur.left.left == null && cur.left.right == null) {
                        if (result == Integer.MIN_VALUE)
                            result = level;
                        else if (result != level)
                            return false;
                    }
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                    if (cur.right.left == null && cur.right.right == null) {
                        if (result == Integer.MIN_VALUE)
                            result = level;
                        else if (result != level)
                            return false;
                    }
                }
            }
            level += 1;
        }
        return true;
    }
}