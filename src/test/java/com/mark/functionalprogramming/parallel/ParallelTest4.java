package com.mark.functionalprogramming.parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ParallelTest4 {

    public static void main(String[] args) {
        log("processorCount: " + Runtime.getRuntime().availableProcessors() + ", commonPool: " + ForkJoinPool.commonPool().getParallelism());

        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
                .parallel()
                .map(HeavyJob::heavyTask)
                .reduce(0, Integer::sum);

        log("time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + sum);
    }
}
