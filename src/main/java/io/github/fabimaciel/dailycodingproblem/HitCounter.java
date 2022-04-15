package io.github.fabimaciel.dailycodingproblem;

import java.util.TreeSet;

/*
Good morning! Here's your coding interview problem for today.

This question was asked by Riot Games.

Design and implement a HitCounter class that keeps track of requests (or hits). It should support the following operations:

    record(timestamp): records a hit that happened at timestamp
    total(): returns the total number of hits recorded
    range(lower, upper): returns the number of hits that occurred between timestamps lower and upper (inclusive)

Follow-up: What if our system has limited memory?
 */
public class HitCounter {
    public static void main(String[] args) {
        HitCounter hitCounter = new HitCounter();
        hitCounter.record(3);
        hitCounter.record(1);
        hitCounter.record(6);
        hitCounter.record(4);
        hitCounter.record(2);
        hitCounter.record(5);


        long range = hitCounter.range(2, 5);
        long total = hitCounter.total();

        System.out.printf("-------------Range is %s:\n", range);
        System.out.printf("-------------Total is %s:", total);
    }

    private TreeSet<Long> counter = new TreeSet<>();

    public void record(long timestamp) {
        counter.add(timestamp);
    }

    public long total() {
        return counter.size();
    }

    public long range(long lower, long upper) {
        Long start = counter.ceiling(lower);
        Long end = counter.ceiling(upper);
        return counter.subSet(start, true, end, true).size();
    }

}