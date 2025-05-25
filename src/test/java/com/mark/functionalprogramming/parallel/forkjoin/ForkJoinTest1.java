package com.mark.functionalprogramming.parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ForkJoinTest1 {

    public static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();

        log("[생성] " + data);

        // ForkJoinPool 생성 및 작업 수행
        long startTime = System.currentTimeMillis();

        try (ForkJoinPool pool = new ForkJoinPool(10)) {
            SumTask task = new SumTask(data);
            Integer result = pool.invoke(task);

            log("time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + result);
            log("pool: " + pool);
        }
    }
}
