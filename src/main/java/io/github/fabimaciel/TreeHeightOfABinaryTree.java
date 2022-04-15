package io.github.fabimaciel;


import java.util.Scanner;

public class TreeHeightOfABinaryTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Node root = new Node(scan.nextInt());
        while(input-- > 1) {
            int value = scan.nextInt();
            root.insert(value);
        }
        scan.close();
        int height = root.height();
        System.out.println(height);
    }

    static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public void insert(int newValue) {
            insert(new Node(newValue));
        }

        public void insert(Node newNode) {
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
        }

        public int height() {
            int leftHeight = 0;
            int rightHeight = 0;
            if (left != null)
                leftHeight = left.height() + 1;

            if (right != null)
                rightHeight = right.height() + 1;

            return Math.max(leftHeight, rightHeight);
        }
    }
}



