package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaSimple3 {

    @Test
    void simpleLambda() {
        MyFunction function1 = (int a, int b) -> a + b;

        // FunctionalInterface 메서드 타입을 기반으로 람다의 매개변수와 반환 겂의 타입을 추론하기 때문에 타입을 생략할 수 있다.
        MyFunction function2 = (a, b) -> a + b;

        log.info("fuction1: {}", function1.apply(1, 2));
        log.info("fuction2: {}", function2.apply(1, 2));
    }
}
