package io.github.fabimaciel;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numTest = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numTest; i++) {

                if (isBalanced(sc.nextLine())) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }


    static List<Character> open = Arrays.asList('{', '[', '(');
    static List<Character> close = Arrays.asList('}', ']', ')');


    public static boolean isBalanced(String input) {
        Stack<Character> openList = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (open.contains(input.charAt(i))) {
                openList.push(input.charAt(i));
            } else {
                if (openList.size() < 1 || open.indexOf(openList.pop()) != close.indexOf(input.charAt(i))) {
                    return false;
                }
            }
        }

        if (openList.size() > 0)
            return false;

        return true;
    }

}
