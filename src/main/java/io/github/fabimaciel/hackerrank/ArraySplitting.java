package io.github.fabimaciel.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySplitting {
    public static int splitIntoTwo(List<Integer> arr) {
        // Write your code here
        long right = arr.stream().reduce(0, (sum,  x) -> sum += x);
        long left = 0;
        int splits = 0;
        for(int i = 0; i < (arr.size() - 1); i++){
            int current = arr.get(i);
            left += current;
            right -= current;
            if(left > right) splits++;
        }

        return splits;
    }

    public static void main(String[] args) {
        int sum = splitIntoTwo(Arrays.asList(-3, -2, 10, 20, -30));
        System.out.println(sum);
    }

}
