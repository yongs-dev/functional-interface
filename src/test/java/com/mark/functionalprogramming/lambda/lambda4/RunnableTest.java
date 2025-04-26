package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class RunnableTest {

    @Test
    void test() {
        // 익명 클래스
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                log.info("{}", "Hello Runnable1");
            }
        };
        runnable1.run();

        // 람다
        Runnable runnable2 = () -> log.info("{}", "Hello Runnable2");
        runnable2.run();
    }
}
