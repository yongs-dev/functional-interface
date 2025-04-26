package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class GenericTest6 {

    @Test
    void test() {
        GenericFunction<String, String> toUpperCase = str -> str.toUpperCase();
        GenericFunction<String, Integer> stringLength = str -> str.length();
        GenericFunction<Integer, Integer> square = n -> n * n;
        GenericFunction<Integer, Boolean> isEven = n -> n % 2 == 0;

        log.info("{}", toUpperCase.apply("Hello"));
        log.info("{}", stringLength.apply("Hello"));
        log.info("{}", square.apply(5));
        log.info("{}", isEven.apply(10));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
