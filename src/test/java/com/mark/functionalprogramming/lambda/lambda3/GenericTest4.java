package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class GenericTest4 {

    @Test
    void test() {
        GenericFunction<String, String> upperCase = new GenericFunction<>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer n) {
                return n * n;
            }
        };

        log.info("result1: {}", upperCase.apply("Hello"));
        log.info("result2: {}", square.apply(5));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
