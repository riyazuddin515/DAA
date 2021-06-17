package bt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    protected static void print(ArrayList<Integer> result) {
        for (Integer e : result)
            System.out.print(e + " ");
    }

    /**
     *            1
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
     *              2      3
     *             /\      \
     *            4  5      6
     *              /\       \
     *             7  8       9
     *                       /\
     *                     10 11
     *                     /\
     *                   12  13
     * @return root
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

    /**
     *              1
     *             /\
     *            2  3
     *           /
     *          4
     *          \
     *           5
     *            \
     *             6
     * @return root
     */
    protected static Node tree5() {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        return root;
    }

    /**
     *              20
     *             /\
     *            8 22
     *           /\  /\
     *          5 3 4 25
     *           /\
     *         10 14
     * @return root
     */
    protected static Node tree6() {
        Node root = new Node(20);

        root.left = new Node(8);
        root.right = new Node(20);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.left = new Node(4);
        root.right.right = new Node(25);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        return root;
    }

    protected static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N')
            return null;
        String[] ip = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }

            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        String str = "62 16 15 N 8 4 7 4 8";
        Node root = buildTree(str);
        print(LevelOrderTraversal.levelOrder(root));
    }
}
