package com.mark.functionalprogramming.parallel;

import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ParallelTest1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
                .map(HeavyJob::heavyTask)
                .reduce(0, Integer::sum);

        log("time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + sum);
    }
}
