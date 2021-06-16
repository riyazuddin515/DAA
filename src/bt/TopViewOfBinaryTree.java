package bt;

import java.util.Map;
import java.util.TreeMap;

public class TopViewOfBinaryTree {

    static TreeMap<Integer, Pair> map = new TreeMap<>();

    public static void main(String[] args) {

        Node root = BinaryTree.tree5();
        topView(root, 0, 0);

        for (Map.Entry<Integer, Pair> entry : map.entrySet()) {
            Integer a = entry.getValue().first;
            map.remove(entry.getKey());
            System.out.print(a + " ");
        }
    }

    private static void topView(Node root, int d, int l) {
        if (root == null)
            return;

        if (map.get(d) == null) {
            map.put(d, new Pair(root.data, l));
        } else if (map.get(d).second > l) {
            map.put(d, new Pair(root.data, l));
        }

        topView(root.left, d - 1, l + 1);
        topView(root.right, d + 1, l + 1);
    }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
