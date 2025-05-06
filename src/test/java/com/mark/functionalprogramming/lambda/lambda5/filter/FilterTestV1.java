package com.mark.functionalprogramming.lambda.lambda5.filter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class FilterTestV1 {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        log.info("evenNumbers: {}", filterEvenNumber(numbers));
        log.info("oddNumbers: {}", filterOddNumber(numbers));
    }

    private static List<Integer> filterEvenNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                filtered.add(number);
            }
        }

        return filtered;
    }

    private static List<Integer> filterOddNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                filtered.add(number);
            }
        }

        return filtered;
    }
}
