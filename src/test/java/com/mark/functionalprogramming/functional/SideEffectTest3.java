package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class SideEffectTest3 {

    @Test
    void test() {
        Function<Integer, Integer> func = x -> x * 2;

        int x = 10;
        func.apply(x);

        // 부수 효과는 순수 함수와 분리해서 실행
        // 출력은 별도로 처리해 순수성 유지
        // 연산(순수 함수)과 외부 동작(부수 효과)을 명확히 분리함으로써 순수 함수를 유지
        log.info("x = {}, result = {}", x, x * 2);
    }
}
