package bt;

public class CheckForBalancedTree {
    public static void main(String[] args) {
        Node root1 = BinaryTree.tree1();
        System.out.println(isBalanced(root1));
        Node root2 = BinaryTree.tree2();
        System.out.println(isBalanced(root2));

    }

    private static boolean isBalanced(Node root) {
        // Your code here
        return check(root) >= 0;
    }

    private static int check(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int left = check(root.left);
        if (left == -1)
            return -1;
        int right = check(root.right);
        if (right == -1)
            return -1;

        int dif = Math.abs(left - right);
        if (dif > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
