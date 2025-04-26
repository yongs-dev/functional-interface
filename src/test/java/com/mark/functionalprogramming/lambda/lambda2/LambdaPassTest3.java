package com.mark.functionalprogramming.lambda.lambda2;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaPassTest3 {

    @Test
    void test() {
        MyFunction add = getOperation("add");
        log.info("add.apply(1, 2): {}", add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        log.info("sub.apply(1, 2): {}", sub.apply(1, 2));

        MyFunction xxx = getOperation("xxx");
        log.info("xxx.apply(1, 2): {}", xxx.apply(1, 2));
    }

    static MyFunction getOperation(String operator) {
        return switch (operator) {
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            default -> (a, b) -> 0;
        };
    }
}
