package bt;

import java.util.Stack;

public class PostOrderTreeTraversal {
    public static void main(String[] args) {
        Node root1 = BinaryTree.tree1();
        Node root2 = BinaryTree.tree2();

        System.out.println("Tree 1");
        System.out.println("Post-Order Recursive");
        postOrderRecursive(root1);
        System.out.println("\nPost-Order Iterative");
        postOrderIterative(root1);

        System.out.println("\n\nTree 2");
        System.out.println("Post-Order Recursive");
        postOrderRecursive(root2);
        System.out.println("\nPost-Order Iterative");
        postOrderIterative(root2);
    }

    protected static void postOrderRecursive(Node root) {
        if (root == null)
            return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
    }

    private static void postOrderIterative(Node root) {
        if (root == null)
            return;
        Stack<Node> inputStack = new Stack<>();
        inputStack.add(root);
        Stack<Node> outputStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            Node cu = inputStack.pop();
            outputStack.add(cu);

            if(cu.left != null)
                inputStack.add(cu.left);

            if (cu.right != null)
                inputStack.add(cu.right);
        }
        while (!outputStack.isEmpty()) {
            System.out.print(outputStack.pop().data+" ");
        }
    }
}
