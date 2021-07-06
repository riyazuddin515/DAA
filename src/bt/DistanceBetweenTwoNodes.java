package bt;

import java.util.ArrayList;
import java.util.Stack;

public class DistanceBetweenTwoNodes {

    public static void main(String[] args) {
        Node root = BinaryTree.buildTree("5 2 N 3 4");
        int n1 = 3;
        int n2 = 4;
        int result = findDistanceBetweenTwoNodes(root, n1, n2);
        System.out.println(result);
    }

    private static int findDistanceBetweenTwoNodes(Node root, int n1, int n2) {
        Stack<Integer> path1 = findPath(root, n1, new Stack<>());
        Stack<Integer> path2 = findPath(root, n2, new Stack<>());
        while (!path1.isEmpty() && !path2.isEmpty()) {
            int a = path1.peek();
            int b = path2.peek();
            if (a == b) {
                path1.pop();
                path2.pop();
            }else
                break;
        }
        return path1.size() + path2.size();
    }

    private static Stack<Integer> findPath(Node root, int n, Stack<Integer> path) {
        if (root == null)
            return path;
        if(root.data == n){
            path.add(root.data);
            return path;
        }
        Stack<Integer> left = findPath(root.left, n, path);
        if (!left.isEmpty()) {
            path.add(root.data);
            return path;
        }
        Stack<Integer> right = findPath(root.right, n, path);
        if (!right.isEmpty()) {
            path.add(root.data);
            return path;
        }
        return path;
    }
}



