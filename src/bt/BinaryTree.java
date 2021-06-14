package bt;

import java.util.ArrayList;

public class BinaryTree {

    protected static void print(ArrayList<Integer> result) {
        for (Integer e : result)
            System.out.print(e + " ");
    }

    /**
     *           1
     *       /       \
     *      2         3
     *     /         /\
     *    4         5 6
     *             /\
     *            7  8
     * @return
     */
    protected static Node tree1() {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);

        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        root.right.right = new Node(6);

        return root;
    }

    /**
     *                  1
     *               /    \
     *              2
     *             /\
     *            4  5
     *              /\
     *             7  8
     * @return
     */
    protected static Node tree2() {
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

        return root;
    }

    /**
     *              5
     *             /
     *            5
     *           /
     *
     * @return
     */
    protected static Node tree3() {
        Node root = new Node(5);
        root.left = new Node(5);

        root.left.left = new Node(4);
        root.left.left.right = new Node(8);
        root.left.left.right.left = new Node(8);
        root.left.left.right.right = new Node(8);

        root.left.right = new Node(10);
        root.left.right.left = new Node(5);
        root.left.right.left.right = new Node(6);

        return root;
    }

    /**
     *              1
     *             /\
     *            2  3
     *           /\  /\
     *          4  56 7
     *             /
     *           8
     *           \
     *           9
     * @return root
     */
    protected static Node tree4() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.right.left.left = new Node(8);
        root.right.left.left.right = new Node(9);
        return root;
    }

}
