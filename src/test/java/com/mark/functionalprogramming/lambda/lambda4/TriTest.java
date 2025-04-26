package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TriTest {

    @Test
    void test() {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a + b + c;
        log.info("triFunction.apply(1, 2, 3): {}", triFunction.apply(1, 2, 3));
    }

    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }
}
