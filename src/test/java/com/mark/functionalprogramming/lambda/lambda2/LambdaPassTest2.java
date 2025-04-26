package com.mark.functionalprogramming.lambda.lambda2;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaPassTest2 {

    @Test
    void test() {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        log.info("변수를 통해 전달");
        calculate(add);
        calculate(sub);

        log.info("람다를 직접 전달");
        calculate((a, b) -> a + b);
        calculate((a, b) -> a - b);
    }

    static void calculate(MyFunction function) {
        int a = 1;
        int b = 2;

        log.info("계산 시작");
        int result = function.apply(a, b);
        log.info("계산 결과: {}", result);
    }
}