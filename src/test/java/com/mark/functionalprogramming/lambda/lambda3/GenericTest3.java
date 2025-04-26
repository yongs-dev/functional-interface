package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class GenericTest3 {

    @Test
    void test() {
        ObjectFunction upperCase = s -> ((String) s).toUpperCase();
        ObjectFunction square = n -> (Integer) n * (Integer) n;

        log.info("result1: {}", upperCase.apply("Hello"));
        log.info("result2: {}", square.apply(5));
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }
}
