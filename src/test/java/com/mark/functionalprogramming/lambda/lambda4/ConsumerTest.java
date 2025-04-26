package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

@Slf4j
public class ConsumerTest {

    @Test
    void test() {
        // 익명 클래스
        Consumer<String> consumer1 = new Consumer<>() {
            @Override
            public void accept(String s) {
                log.info("{}", s);
            }
        };
        consumer1.accept("hello");

        // 람다
        Consumer<String> consumer2 = s -> log.info("{}", s);
        consumer2.accept("hello");
    }
}
