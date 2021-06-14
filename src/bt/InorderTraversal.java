package bt;

import java.util.Stack;

public class InorderTraversal {
    public static void main(String[] args) {
        Node root1 = BinaryTree.tree1();
        Node root2 = BinaryTree.tree2();

        System.out.println("Tree 1");
        BinaryTree.print(LevelOrderTraversal.levelOrder(root1));
        System.out.println("\nInorder Recurse");
        inOrderRecur(root1);
        System.out.println("\nInorder Iterative");
        inOrderIterative(root1);

        System.out.println("\n\nTree 2");
        BinaryTree.print(LevelOrderTraversal.levelOrder(root2));
        System.out.println("\nInorder Recurse");
        inOrderRecur(root2);
        System.out.println("\nInorder Iterative");
        inOrderIterative(root2);
    }

    private static void inOrderIterative(Node root) {
        if (root == null)
            return;
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.add(temp);
                temp = temp.left;

            }else {
                Node a = stack.pop();
                System.out.print(a.data+" ");
                temp = a.right;
            }

        }
    }

    private static void inOrderRecur(Node root) {
        if (root == null) {
            return;
        }
        inOrderRecur(root.left);
        System.out.print(root.data + " ");
        inOrderRecur(root.right);

    }


}
