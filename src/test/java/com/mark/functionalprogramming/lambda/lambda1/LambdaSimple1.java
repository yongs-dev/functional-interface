package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaSimple1 {

    @Test
    void simpleLambda() {
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };
        log.info("function1: {}", function1.apply(1, 2));

        MyFunction function2 = (int a, int b) -> a + b;
        log.info("function2: {}", function2.apply(1, 2));

        MyFunction function3 = (int a, int b) -> {
            log.info("람다 실행");
            return a + b;
        };
        log.info("fuction3: {}", function3.apply(1, 2));
    }
}
