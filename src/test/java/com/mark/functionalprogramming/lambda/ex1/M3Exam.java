package com.mark.functionalprogramming.lambda.ex1;

import com.mark.functionalprogramming.lambda.Procedure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

@Slf4j
public class M3Exam {

    @Test
    void test() {
        measure(() -> {
            long count = 0;
            for (int i = 1; i <= 100; i++) {
                count += i;
            }

            log.info("[1부터 100까지 합] 결과: {}", count);
        });

        measure(() -> {
            int[] array = {4, 3, 2, 1};
            log.info("원본 배열: {}", Arrays.toString(array));
            Arrays.sort(array);
            log.info("배열 정렬: {}", Arrays.toString(array));

        });
    }

    static void measure(Procedure procedure) {
        long start = System.nanoTime();

        procedure.run();

        long end = System.nanoTime();
        log.info("실행 시간: {}ns", end - start);
    }
}
