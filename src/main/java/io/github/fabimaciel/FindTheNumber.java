package io.github.fabimaciel;

import java.util.Arrays;
import java.util.List;

public class FindTheNumber {


    /*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */
    static final String YES = "YES";
    static final String NO = "NO";

    static String findNumber(List<Integer> arr, int k) {
        arr.sort((x, y) -> x -y);
        int start = 0;
        int end = arr.size() - 1;

        while (end >= start) {
            int mid = (end - start) / 2 + start;
            if (arr.get(mid) == k) return YES;

            if (arr.get(mid) > k) {
                end = mid-1;
                continue;
            }
            start = mid+1;
        }

        return NO;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1);
        System.out.println(findNumber(list, 2));
    }

}
