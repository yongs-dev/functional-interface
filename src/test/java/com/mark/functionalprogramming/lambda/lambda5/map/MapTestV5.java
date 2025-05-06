package com.mark.functionalprogramming.lambda.lambda5.map;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class MapTestV5 {

    @Test
    void test() {
        List<String> fruits = List.of("apple", "banana", "orange");

        // String -> String
        log.info("upper fruits: {}", GenericMapper.map(fruits, s -> s.toUpperCase()));

        // String -> Integer
        log.info("fruits length: {}", GenericMapper.map(fruits, s -> s.length()));

        // Integer -> String
        List<Integer> numbers = List.of(1, 2, 3);
        log.info("stars: {}", GenericMapper.map(numbers, n -> "*".repeat(n)));
    }
}
