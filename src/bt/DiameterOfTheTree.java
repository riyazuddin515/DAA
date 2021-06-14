package bt;

public class DiameterOfTheTree {

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        tree1(); //9
        tree2(); //4
        tree3(); //7
        tree4();//1
    }

    private static void tree4() {
        Node root = new Node(48);
        diameter(root);
        System.out.println(max);
        max = 1;
    }

    private static void tree1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);

        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.right.right = new Node(9);

        root.right.right.right.left = new Node(10);
        root.right.right.right.right = new Node(11);

        root.right.right.right.left.left = new Node(12);
        root.right.right.right.left.right = new Node(13);

        diameter(root);
        System.out.println(max);
        max = 1;
    }

    private static void tree3() {
        Node root = new Node(5);
        root.left = new Node(5);

        root.left.left = new Node(4);
        root.left.left.right = new Node(8);
        root.left.left.right.left = new Node(8);
        root.left.left.right.right = new Node(8);

        root.left.right = new Node(10);
        root.left.right.left = new Node(5);
        root.left.right.left.right = new Node(6);

        diameter(root);
        System.out.println(max);
        max = 1;
    }

    private static void tree2(){
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        diameter(root);
        System.out.println(max);
        max = 1;
    }


    private static int diameter(Node node) {

        if (node.left == null && node.right == null)
            return 1;

        int left = node.left != null ? diameter(node.left) : 0;
        int right = node.right != null ? diameter(node.right) : 0;

        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }
}

