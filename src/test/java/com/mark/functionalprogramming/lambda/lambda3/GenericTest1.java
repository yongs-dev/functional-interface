package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class GenericTest1 {

    @Test
    void test() {
        StringFunction upperCase = s -> s.toUpperCase();
        NumberFunction square = n -> n * n;

        log.info("result1: {}", upperCase.apply("Hello"));
        log.info("result2: {}", square.apply(5));
    }

    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        Integer apply(Integer n);
    }
}
