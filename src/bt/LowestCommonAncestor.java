package bt;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Stack;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Node root = BinaryTree.buildTree("5 2 N 3 4");
        int n1 = 3;
        int n2 = 4;
        Node result = findLowestCommonAncestor(root, n1, n2);
        System.out.println(result.data);
    }

    private static Node findLowestCommonAncestor(Node root, int n1, int n2) {
        Stack<Node> path1 = findPath(root, n1, new Stack<>());
        Stack<Node> path2 = findPath(root, n2, new Stack<>());
        Node r = null;
        while (!path1.isEmpty() && !path2.isEmpty()) {
            Node a = path1.pop();
            Node b = path2.pop();
            if (a.data == b.data)
                r = a;
        }
        return r;
    }

    private static Stack<Node> findPath(Node root, int n, Stack<Node> path) {
        if (root == null)
            return path;
        if(root.data == n){
            path.add(root);
            return path;
        }
        Stack<Node> left = findPath(root.left, n, path);
        if (!left.isEmpty()) {
            path.add(root);
            return path;
        }
        Stack<Node> right = findPath(root.right, n, path);
        if (!right.isEmpty()) {
            path.add(root);
            return path;
        }
        return path;
    }
}
