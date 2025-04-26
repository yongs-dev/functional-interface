package com.mark.functionalprogramming.lambda.lambda2;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaPassTest1 {

    @Test
    void test() {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        log.info("add.apply(1, 2): {}", add.apply(1, 2));
        log.info("sub.apply(1, 2): {}", sub.apply(1, 2));

        MyFunction cal = add;
        log.info("cal.apply(1, 2): {}", cal.apply(1, 2));

        cal = sub;
        log.info("cal.apply(1, 2): {}", cal.apply(1, 2));
    }
}
