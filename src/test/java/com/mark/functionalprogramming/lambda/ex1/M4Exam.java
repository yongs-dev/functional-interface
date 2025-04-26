package com.mark.functionalprogramming.lambda.ex1;

import com.mark.functionalprogramming.lambda.MyFunction;
import com.mark.functionalprogramming.lambda.Procedure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
public class M4Exam {

    @Test
    void test() {
        MyFunction add = getOperator("add");
        MyFunction sub = getOperator("sub");
        MyFunction xxx = getOperator("xxx");

        log.info("add.apply(1, 2): {}", add.apply(1, 2));
        log.info("sub.apply(1, 2): {}", sub.apply(1, 2));
        log.info("xxx.apply(1, 2): {}", xxx.apply(1, 2));
    }

    static MyFunction getOperator(String operator) {
        return switch (operator) {
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            default -> (a, b) -> 0;
        };
    }
}
