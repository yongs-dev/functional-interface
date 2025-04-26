package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class GenericTest2 {

    @Test
    void test() {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return ((String) s).toUpperCase();
            }
        };

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };

        log.info("result1: {}", upperCase.apply("Hello"));
        log.info("result2: {}", square.apply(5));
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }
}
