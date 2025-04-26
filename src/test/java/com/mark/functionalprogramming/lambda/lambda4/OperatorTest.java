package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

@Slf4j
public class OperatorTest {

    @Test
    void test() {
        // UnaryOperator
        Function<Integer, Integer> square1 = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;
        log.info("square1.test(10): {}", square1.apply(10));
        log.info("square2.test(10): {}", square2.apply(10));

        // BinaryOperator
        BiFunction<Integer, Integer, Integer> addition1 = (a, b) -> a + b;
        BinaryOperator<Integer> addition2 = (a, b) -> a + b;
        log.info("addition1.apply(1, 2): {}", addition1.apply(1, 2));
        log.info("addition2.apply(1, 2): {}", addition2.apply(1, 2));
    }
}
