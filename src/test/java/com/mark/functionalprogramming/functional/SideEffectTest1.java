package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class SideEffectTest1 {

    public static int count = 0;

    @Test
    void test() {
        log.info("before count = {}", count);

        Function<Integer, Integer> func = x -> {
            // Side Effect : 외부 상태 변경 발생
            count++;
            return x * 2;
        };

        func.apply(10);

        log.info("after count = {}", count);
    }
}
