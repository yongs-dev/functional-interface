package com.mark.functionalprogramming.lambda.lambda5.filter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class FilterTestV2 {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        log.info("evenNumbers: {}", filter(numbers, n -> n % 2 == 0));
        log.info("oddNumbers: {}", filter(numbers, n -> n % 2 == 1));
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filtered.add(number);
            }
        }

        return filtered;
    }
}
