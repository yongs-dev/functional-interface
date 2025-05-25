package com.mark.functionalprogramming.parallel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ParallelTest5 {

    public static void main(String[] args) throws InterruptedException {
        // 병렬 수준 3으로 제한
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");

        // 요청 풀 추가
        ExecutorService requestPool = Executors.newFixedThreadPool(100);
        int nThreads = 20; // 1, 2, 3, 20

        for (int i = 1; i <= nThreads; i++) {
            String requestName = "request-" + i;
            requestPool.submit(() -> logic(requestName));
            Thread.sleep(100);
        }

        requestPool.close();
    }

    private static void logic(String requestName) {
        log("[" + requestName + "] START");
        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 4)
                .parallel()
                .map(i -> HeavyJob.heavyTask(i, requestName))
                .reduce(0, Integer::sum);

        log("[" + requestName + "] time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + sum);
    }
}
