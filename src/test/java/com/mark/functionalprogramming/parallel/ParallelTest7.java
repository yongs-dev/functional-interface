package com.mark.functionalprogramming.parallel;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ParallelTest7 {

    public static void main(String[] args) throws InterruptedException {
        // 요청 풀 추가
        ExecutorService requestPool = Executors.newFixedThreadPool(100);
        ExecutorService loginPool = Executors.newFixedThreadPool(400);

        int nThreads = 20; // 1, 2, 3, 20
        for (int i = 1; i <= nThreads; i++) {
            String requestName = "request-" + i;
            requestPool.submit(() -> logic(requestName, loginPool));
            Thread.sleep(100);
        }

        requestPool.close();
    }

    private static void logic(String requestName, ExecutorService es) {
        log("[" + requestName + "] START");
        long startTime = System.currentTimeMillis();

        List<Future<Integer>> futures = IntStream.rangeClosed(1, 4)
                .mapToObj(i -> es.submit(() -> HeavyJob.heavyTask(i, requestName)))
                .toList();

        int sum = futures.stream()
                .mapToInt(f -> {
                    try {
                        return f.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                })
                .reduce(0, Integer::sum);

        log("[" + requestName + "] time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + sum);
        es.close();
    }
}
