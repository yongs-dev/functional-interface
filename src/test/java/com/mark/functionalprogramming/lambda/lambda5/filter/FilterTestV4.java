package com.mark.functionalprogramming.lambda.lambda5.filter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;


@Slf4j
public class FilterTestV4 {

    @Test
    void test() {
        // 숫자 사용 필터
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        log.info("evenNumbers: {}", GenericFilter.filter(numbers, n -> n % 2 == 0));
        log.info("oddNumbers: {}", GenericFilter.filter(numbers, n -> n % 2 == 1));

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        log.info("strings: {}", GenericFilter.filter(strings, s -> s.length() > 1));
    }
}
