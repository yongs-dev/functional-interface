package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class SideEffectTest2 {

    @Test
    void test() {
        Function<Integer, Integer> func = x -> {
            int result = x * 2;

            // Side Effect. 콘솔에 출력하는 동작. 외부 세계(콘솔)에 영향을 미치므로 순수 함수가 아니다.
            log.info("x = {}, result = {}", x, x * 2);
            return result;
        };

        func.apply(10);
        func.apply(10);
    }
}
