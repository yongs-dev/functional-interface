package com.mark.functionalprogramming.lambda.lambda5.filter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class FilterTestV3 {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        log.info("evenNumbers: {}", IntegerFilter.filter(numbers, n -> n % 2 == 0));
        log.info("oddNumbers: {}", IntegerFilter.filter(numbers, n -> n % 2 == 1));
    }
}
