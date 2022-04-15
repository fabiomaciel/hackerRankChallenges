package io.github.fabimaciel.exponent.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class LeftTreeView1 {
    public static void main(String[] args) {
        Node tree = new Node(5)
                .insert(3)
                .insert(4)
                .insert(2)
                .insert(10)
                .insert(9)
                .insert(11);
        LeftTreeView2 leftTreeView = new LeftTreeView2();
        leftTreeView.leftView(tree);
    }

    public void leftView(Node root) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.print(root.data);
        int level = 1;
        Integer leftData;
        do {
            queue.clear();
            leftOfLevel(root, level, queue);
            level = level + 1;
            leftData = queue.peek();
            if (leftData != null)
                System.out.printf(" %d", leftData);
        } while (leftData != null);
    }


    public Queue<Integer> leftOfLevel(Node root, int level, Queue<Integer> queue) {
        if (root == null) return queue;

        if (level == 0) {
            queue.add(root.data);
            return queue;
        }

        leftOfLevel(root.left, level - 1, queue);
        leftOfLevel(root.right, level - 1, queue);
        return queue;

    }
}

