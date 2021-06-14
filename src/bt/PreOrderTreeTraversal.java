package bt;

import java.util.Stack;

public class PreOrderTreeTraversal {
    public static void main(String[] args) {
        Node root1 = BinaryTree.tree1();
        Node root2 = BinaryTree.tree2();

        System.out.println("Tree 1");
        System.out.println("Pre-Order Recursive");
        preOrderRecursive(root1);
        System.out.println("\nPre-Order Iterative");
        preOrderIterative(root1);

        System.out.println("\n\nTree 2");
        System.out.println("Pre-Order Recursive");
        preOrderRecursive(root2);
        System.out.println("\nPre-Order Iterative");
        preOrderIterative(root2);
    }

    private static void preOrderRecursive(Node root) {
        if (root == null)
            return;

        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);

    }

    private static void preOrderIterative(Node root) {
        if (root == null)
            return;
        Node currentNode = root;
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                System.out.print(currentNode.data+" ");
                stack.add(currentNode);
                currentNode = currentNode.left;
            }
            else {
                Node a = stack.pop();
                currentNode = a.right;
            }
        }
    }
}
