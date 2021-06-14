package bt;

public class HeightOfTheTree {
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        System.out.println(height(root));
    }

    private static int height(Node node) {
        // code here
        if (node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        if (left > right)
            return left + 1;
        else
            return right + 1;
    }
}
