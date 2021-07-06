package bt;

import java.util.Stack;

public class IsoMorphicTrees {
    public static void main(String[] args) {
        Node tree1 = BinaryTree.buildTree("8 10 7 4 9");
        Node tree2 = BinaryTree.buildTree("8 7 7 9 7");
        System.out.println(isoMorphicOrNot(tree1, tree2));

    }

    private static boolean isoMorphicOrNot(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.data != root2.data)
            return false;

        return isoMorphicOrNot(root1.left, root2.left) && isoMorphicOrNot(root1.right, root2.right) ||
        isoMorphicOrNot(root1.left, root2.right) && isoMorphicOrNot(root1.right, root2.left);
    }
}
