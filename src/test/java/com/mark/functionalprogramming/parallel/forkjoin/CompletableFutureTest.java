package com.mark.functionalprogramming.parallel.forkjoin;

import com.mark.functionalprogramming.util.MyLogger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest {

    public static void main(String[] args) throws InterruptedException {
        // ForkJoin common pool 사용
        CompletableFuture.runAsync(() -> MyLogger.log("Fork/Join common pool"));

        // 항상 별도 풀을 지정해서 사용하는 게 좋다.
        try (ExecutorService es = Executors.newFixedThreadPool(100)) {
            CompletableFuture.runAsync(() -> MyLogger.log("Custom Pool"), es);

            Thread.sleep(100);
        }
    }
}
