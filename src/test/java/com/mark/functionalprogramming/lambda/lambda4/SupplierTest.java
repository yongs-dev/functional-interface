package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.function.Supplier;

@Slf4j
public class SupplierTest {

    @Test
    void test() {
        // 익명 클래스
        Supplier<Integer> supplier1 = new Supplier<>() {

            @Override
            public Integer get() {
                return new Random().nextInt(10);
            }
        };
        log.info("{}", supplier1.get());

        // 람다
        Supplier<Integer> supplier2 = () -> new Random().nextInt(10);
        log.info("{}", supplier2.get());
    }
}
