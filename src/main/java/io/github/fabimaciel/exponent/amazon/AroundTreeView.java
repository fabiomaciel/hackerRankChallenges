package io.github.fabimaciel.exponent.amazon;

import java.util.Queue;
import java.util.Stack;

public class AroundTreeView {
    public static void main(String[] args) {
        Node tree = new Node(5)
                .insert(3)
                .insert(4)
                .insert(2)
                .insert(10)
                .insert(9)
                .insert(11);
        AroundTreeView leftTreeView = new AroundTreeView();
        leftTreeView.leftView(tree);
    }

    int printedLeftLevel = 0;
    int printedRighttLevel = 0;

    public void leftView(Node root) {
        Stack<Integer> stack = new Stack<>();
        leftView(root, 0, stack);
        while (!stack.empty()){
            System.out.printf(" %d", stack.pop());
        }
        System.out.printf(" %d", root.data);
        rightView(root, 0);
    }


    public void leftView(Node root, int level, Stack<Integer> stack) {
        if (root == null) return;
        if (level > printedLeftLevel) {
            printedLeftLevel = level;
            //System.out.printf(" %d", root.data);
            stack.add(root.data);
        }

        leftView(root.left, level + 1, stack);
        leftView(root.right, level + 1, stack);
    }

    public void rightView(Node root, int level) {
        if (root == null) return;
        if (level > printedRighttLevel) {
            printedRighttLevel = level;
            System.out.printf(" %d", root.data);
        }

        rightView(root.right, level + 1);
        rightView(root.left, level + 1);

    }
}


