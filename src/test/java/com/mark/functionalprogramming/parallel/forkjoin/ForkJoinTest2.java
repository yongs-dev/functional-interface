package com.mark.functionalprogramming.parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ForkJoinTest2 {

    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        log("processorCount: " + Runtime.getRuntime().availableProcessors() + ", commonPool: " + commonPool.getParallelism());

        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();

        log("[생성] " + data);

        SumTask task = new SumTask(data);
        Integer result = task.invoke();

        log("sum: " + result);
    }
}
