package com.mark.functionalprogramming.parallel;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ParallelTest6 {

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

        Future<Integer> f1 = es.submit(() -> HeavyJob.heavyTask(1, requestName));
        Future<Integer> f2 = es.submit(() -> HeavyJob.heavyTask(2, requestName));
        Future<Integer> f3 = es.submit(() -> HeavyJob.heavyTask(3, requestName));
        Future<Integer> f4 = es.submit(() -> HeavyJob.heavyTask(4, requestName));

        int sum = 0;
        try {
            sum = f1.get() + f2.get() + f3.get() + f4.get();
        } catch (InterruptedException | ExecutionException ignored) {}

        log("[" + requestName + "] time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + sum);
        es.close();
    }
}
