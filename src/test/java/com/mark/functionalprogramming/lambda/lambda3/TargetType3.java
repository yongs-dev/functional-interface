package com.mark.functionalprogramming.lambda.lambda3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class TargetType3 {

    @Test
    void test() {
        Function<Integer, String> functionA = i -> "value = " + i;
        log.info("{}", functionA.apply(10));

        Function<Integer, String> functionB = functionA;
        log.info("{}", functionB.apply(20));
    }
}
