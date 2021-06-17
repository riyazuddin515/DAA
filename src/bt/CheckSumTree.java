package bt;

public class CheckSumTree {

    public static void main(String[] args) {
        String str1 = "62 16 15 N 8 4 7 N 8 4";
        Node root1 = BinaryTree.buildTree(str1);
        Check check = new Check();
        check(check.recur(root1));
        String str2 = "10 20 30 10 10";
        Node root2 = BinaryTree.buildTree(str2);
        check(check.recur(root2));
    }

    private static void check(int result) {
        if (result == Integer.MIN_VALUE)
            System.out.println(0);
        else
            System.out.println(1);
    }


//    private static boolean check(Node root) {
//        if (root == null)
//            return false;
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node cur = queue.poll();
//            if (cur.left == null && cur.right == null)
//                continue;
//            int left = cur.left != null ? cur.left.data : 0;
//            int right = cur.right != null ? cur.right.data : 0;
//            if (left + right != root.data)
//                return false;
//            if (cur.left != null)
//                queue.add(cur.left);
//            if (cur.right != null)
//                queue.add(cur.right);
//        }
//        return true;
//    }
}

class Check{
    boolean consisted;

    protected int recur(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.data;
        int left = recur(root.left);
        int right = recur(root.right);
        int sum = left + right;
        if (sum != root.data)
            consisted = true;
        if (consisted)
            return Integer.MIN_VALUE;
        return sum + root.data;
    }
}
