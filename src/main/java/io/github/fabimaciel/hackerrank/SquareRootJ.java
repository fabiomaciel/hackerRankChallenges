package io.github.fabimaciel.hackerrank;

public class SquareRootJ {
    public static double getSquares(int a, int b) {
        return Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1;
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 40;
        System.out.println(getSquares(a, b));
    }
}

