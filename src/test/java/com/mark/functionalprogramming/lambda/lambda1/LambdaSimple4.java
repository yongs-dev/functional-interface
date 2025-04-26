package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaSimple4 {

    @Test
    void simpleLambda() {
        MyCall call1 = (int value) -> value; // 기본
        MyCall call2 = (value) -> value * 2; // 타입 추론
        MyCall call3 = value -> value * 3; // 매개변수가 1개인 경우 소괄호 생략 가능

        log.info("call1: {}", call1.call(2));
        log.info("call2: {}", call2.call(2));
        log.info("call3: {}", call3.call(2));
    }

    interface MyCall {
        int call(int value);
    }
}
