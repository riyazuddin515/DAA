package bt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagBinaryTree {
    public static void main(String[] args) {
        Node root = BinaryTree.tree2();
        ArrayList<Integer> zigZagOrder = zigZagLevelOrder(root);
        for(Integer e: zigZagOrder)
            System.out.print(e+" ");
    }

    private static ArrayList<Integer> zigZagLevelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();
        Stack<Node> stackA = new Stack<>();
        stackA.add(root);
        Stack<Node> stackB = new Stack<>();
        Stack<Node> stackC = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean right = true;
        while (!stackA.isEmpty()) {
            if (right) {
                while (!stackA.isEmpty()) {
                    Node currentNode = stackA.pop();
                    if (currentNode.left != null)
                        stackB.add(currentNode.left);
                    if (currentNode.right != null)
                        stackB.add(currentNode.right);
                    arrayList.add(currentNode.data);
                }
                right = false;
            }else {
                while (!stackA.isEmpty()) {
                    Node currentNode = stackA.pop();
                    if (currentNode.left != null)
                        stackB.add(currentNode.left);
                    if (currentNode.right != null)
                        stackB.add(currentNode.right);
                    stackC.add(currentNode);
                }
                right = true;
                while (!stackC.isEmpty())
                    arrayList.add(stackC.pop().data);
            }
            while (!stackB.isEmpty())
                stackA.add(stackB.pop());
        }
        return arrayList;
    }
}
