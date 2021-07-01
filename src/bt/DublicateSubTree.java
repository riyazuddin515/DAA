package bt;

import java.util.HashSet;

public class DublicateSubTree {

    private final static String MASTER = "$";

    public static void main(String[] args) {
        Node root = BinaryTree.buildTree("1 2 3 4 5 N 2 N N N N 4 5");
        String result = recur(root, new HashSet<>());
        if (result.equals("TRUE"))
            System.out.println("Duplicate");
        else
            System.out.println("Not Duplicate");
    }

    private static String recur(Node root, HashSet<String> hashSet) {
        if (root == null)
            return MASTER;

        if (root.left == null && root.right == null)
            return ""+root.data;

        String left = recur(root.left, hashSet);
        if (left.equals("TRUE"))
            return "TRUE";

        String right = recur(root.right, hashSet);
        if (right.equals("TRUE"))
            return "TRUE";

        String s = left + root.data + right;
        if (hashSet.contains(s))
            return "TRUE";

        hashSet.add(s);
        return s;
    }
}
