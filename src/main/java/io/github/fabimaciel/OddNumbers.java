package io.github.fabimaciel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        if(l % 2 == 0) l = l+1;
        for(int i = l; i <= r; i += 2){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(oddNumbers(3, 9));
    }

}
