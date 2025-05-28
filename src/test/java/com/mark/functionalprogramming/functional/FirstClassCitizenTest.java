package com.mark.functionalprogramming.functional;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class FirstClassCitizenTest {

    @Test
    void test() {
        // 함수를 변수에 담는다
        Function<Integer, Integer> func = x -> x * 2;

        // 함수를 인자로 전달
        applyFunction(10, func);

        // 함수를 반환
        getFunc().apply(10);
    }

    // 고차 함수 : 함수를 인자로 받음
    private Integer applyFunction(int i, Function<Integer, Integer> func) {
        return func.apply(i);
    }

    // 고차 함수 : 함수를 반환
    private Function<Integer, Integer> getFunc() {
        return x -> x * 2;
    }
}
