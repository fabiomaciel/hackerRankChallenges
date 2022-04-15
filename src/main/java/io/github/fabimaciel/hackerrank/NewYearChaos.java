package io.github.fabimaciel.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;



public class NewYearChaos {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                new Result().minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    static class Result {

        /*
         * Complete the 'minimumBribes' function below.
         *
         * The function accepts INTEGER_ARRAY q as parameter.
         */

        public void minimumBribes(List<Integer> q) {
            System.out.println(computeBribes(q));
        }

        private String computeBribes(List<Integer> q) {
            int bribes = 0;
            for (int i = 0; i < q.size(); i++) {
                if(q.get(i) - (i + 1) > 2)
                    return "Too chaotic\n";
                for (int j = 0; j < i; j++) {
                    if (q.get(i) < q.get(j))
                        bribes++;
                }
            }

            return String.format("%d\n", bribes);
        }

    }
}
