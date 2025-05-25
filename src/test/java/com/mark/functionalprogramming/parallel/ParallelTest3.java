package com.mark.functionalprogramming.parallel;

import java.util.concurrent.*;
import java.util.stream.IntStream;

import static com.mark.functionalprogramming.util.MyLogger.log;

public class ParallelTest3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            long startTime = System.currentTimeMillis();

            // 1. Fork - 작업을 분할한다.
            SumTask task1 = new SumTask(1, 4);
            SumTask test2 = new SumTask(5, 8);

            // 2. 분할한 작업을 처리한다.
            Future<Integer> future1 = executor.submit(task1);
            Future<Integer> future2 = executor.submit(test2);

            // 3. Join - 처리한 결과를 합친다. get: 결과가 나올 때 까지 대기한다.(Blocking)
            int sum = future1.get() + future2.get();
            log("main 스레드 대기 완료");

            log("time: " + (System.currentTimeMillis() - startTime) + "ms, sum: " + sum);
        }
    }

    static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() {
            log("작업 시작");

            int result = IntStream.rangeClosed(startValue, endValue)
                    .map(HeavyJob::heavyTask)
                    .reduce(0, Integer::sum);

            log("작업 완료. result = " + result);
            return result;
        }
    }
}
