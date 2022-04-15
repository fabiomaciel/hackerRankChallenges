package io.github.fabimaciel.exponent.amazon;

public class LeftTreeView2 {
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

    int printedLevel = 0;

    public void leftView(Node root) {
        System.out.print(root.data);
        leftOfLevel(root, 0);
    }


    public void leftOfLevel(Node root, int level) {
        if (root == null) return;
        if (level > printedLevel) {
            printedLevel = level;
            System.out.printf(" %d", root.data);
        }

        leftOfLevel(root.left, level + 1);
        leftOfLevel(root.right, level + 1);
    }
}


