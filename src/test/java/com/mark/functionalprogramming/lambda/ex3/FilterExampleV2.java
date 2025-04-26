package com.mark.functionalprogramming.lambda.ex3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class FilterExampleV2 {

    @Test
    void test() {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        log.info("원본 리스트: {}", numbers);

        log.info("음수만: {}", filter(numbers, (v) -> v < 0));
        log.info("짝수만: {}", filter(numbers, (v) -> v % 2 == 0));
    }

    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }

        return result;
    }
}
