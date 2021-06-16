package bt;

import java.util.Map;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    static TreeMap<Integer, Pair> map = new TreeMap<>();

    public static void main(String[] args) {

        Node root = BinaryTree.tree6();
        bottomView(root, 0, 0);

        for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
            System.out.print(entry.getValue().first + " ");
        }
    }

    private static void bottomView(Node root, int d, int l) {
        if (root == null)
            return;

        if (map.get(d) == null) {
            map.put(d, new Pair(root.data, l));
        } else if (map.get(d).second <= l) {
            map.put(d, new Pair(root.data, l));
        }

        bottomView(root.left, d - 1, l + 1);
        bottomView(root.right, d + 1, l + 1);
    }
}