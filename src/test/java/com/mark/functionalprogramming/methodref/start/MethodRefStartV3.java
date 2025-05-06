package com.mark.functionalprogramming.methodref.start;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

@Slf4j
public class MethodRefStartV3 {

    @Test
    public void test() {
        BinaryOperator<Integer> add1 = MethodRefStartV3::add; // (x, y) -> add(x, y);
        BinaryOperator<Integer> add2 = MethodRefStartV3::add; // (x, y) -> add(x, y);

        Integer result1 = add1.apply(1, 2);
        log.info("result1: {}", result1);

        Integer result2 = add2.apply(1, 2);
        log.info("result2: {}", result2);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
