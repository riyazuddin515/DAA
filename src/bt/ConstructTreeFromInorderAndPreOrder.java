package bt;

public class ConstructTreeFromInorderAndPreOrder {

    static int preIndex = 0;

    public static void main(String[] args) {
        int[] inorder = {3, 1, 4, 0, 5, 2};
        int[] preorder = {0, 1, 3, 4, 2, 5};
        int n = inorder.length;
        Node root = recur(inorder, preorder, 0, n - 1);
        PostOrderTreeTraversal.postOrderRecursive(root);
    }

    private static Node recur(int[] inorder, int[] preorder, int i, int j) {

        if (i > j)
            return null;
        Node node = new Node(preorder[preIndex++]);

        if (i == j)
            return node;
        int end = search(inorder, i, j, node.data);

        node.left = recur(inorder, preorder, i, end - 1);
        node.right = recur(inorder, preorder, end + 1, j);

        return node;
    }

    private static int search(int[] inorder, int i, int j, int data) {
        for (int z = i; z <= j; z++) {
            if (inorder[z] == data)
                return z;
        }
        return i;
    }
}
