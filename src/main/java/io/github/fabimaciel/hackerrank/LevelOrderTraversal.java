package io.github.fabimaciel.hackerrank;

import java.util.Scanner;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Node root = new Node(scan.nextInt());
        while (input-- > 1) {
            int value = scan.nextInt();
            root.insert(value);
        }
        scan.close();
        levelOrder(root);
    }

    public static void levelOrder(Node root) {
        System.out.print(root.value);

        for (int level = 2; printLevel(root, level); level++) ;

    }

    public static boolean printLevel(Node root, int level) {
        if (root == null) return false;

        if (level == 1) {
            System.out.printf(" %s", root.value);
            return true;
        }

        boolean leftContinue = printLevel(root.left, level - 1);
        boolean rightContinue = printLevel(root.right, level - 1);

        return leftContinue || rightContinue;
    }


    static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node insert(int newValue) {
            return insert(new Node(newValue));
        }

        public Node insert(Node newNode) {
            if (newNode.value < value) {
                if (left != null) {
                    left.insert(newNode);
                } else {
                    left = newNode;
                }
            } else if (newNode.value > value) {
                if (right != null) {
                    right.insert(newNode);
                } else {
                    right = newNode;
                }
            }
            return this;
        }
    }
}

