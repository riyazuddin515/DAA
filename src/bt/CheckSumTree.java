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
            return Integer.MIN_VALUE;
//            consisted = true;
//        if (consisted)
//            return Integer.MIN_VALUE;
        return sum + root.data;
    }
}
