package bt;

public class TransformToSumTree {
    public static void main(String[] args) {
        Node root1 = BinaryTree.tree1();
        sum(root1);
        BinaryTree.print(LevelOrderTraversal.levelOrder(root1));
    }

    private static int sum(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            int temp = root.data;
            root.data = 0;
            return temp;
        }
        int left = sum(root.left);
        int right = sum(root.right);

        int sum = left + right;
        int temp = root.data;
        root.data = sum;
        sum = sum + temp;
        return sum;
    }
}
