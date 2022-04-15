package io.github.fabimaciel.exponent.amazon;

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int value) {
        this.data = value;
    }


    public Node insert(int data) {
        return insert(new Node(data));
    }

    public Node insert(Node node) {
        if (node.data < data) {
            if (left != null) {
                left.insert(node);
            } else {
                left = node;
            }
        } else if (node.data > data) {
            if (right != null) {
                right.insert(node);
            } else {
                right = node;
            }
        }
        return this;
    }


}

