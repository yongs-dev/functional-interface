package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class TargetType2 {

    @Test
    void test() {
        Function<String, String> upperCase = str -> str.toUpperCase();
        Function<Integer, Integer> square = n -> n * n;
        log.info("{}", upperCase.apply("Hello"));
        log.info("{}", square.apply(3));
    }
}
