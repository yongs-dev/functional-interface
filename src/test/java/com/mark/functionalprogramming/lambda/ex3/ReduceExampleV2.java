package com.mark.functionalprogramming.lambda.ex3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.IntBinaryOperator;

@Slf4j
public class ReduceExampleV2 {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        log.info("원본 리스트: {}", numbers);

        log.info("합(누적 +): {}", reduce(numbers, 0, (a, b) -> a + b));
        log.info("곱(누적 *): {}", reduce(numbers, 1, (a, b) -> a * b));
    }

    static int reduce(List<Integer> list, int initial, IntBinaryOperator reducer) {
        int result = initial;

        for (int v : list) {
            result = reducer.applyAsInt(result, v);
        }

        return result;
    }
}
