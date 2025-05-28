package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class CompositionTest1 {

    @Test
    void test() {
        // 1. x를 입력받아 x * x 하는 함수
        Function<Integer, Integer> square = x -> x * x;

        // 2. x를 입력받아 x + 1을 하는 함수
        Function<Integer, Integer> add = x -> x + 1;

        // 3. square와 add를 합친 함수 -> square(add(2)) -> square(3) -> 9
        Function<Integer, Integer> newFunc1 = square.compose(add);
        log.info("newFunc1: {}", newFunc1.apply(2));

        // 4. square와 add를 합친 함수 -> add(square(2)) -> add(4) -> 5
        Function<Integer, Integer> newFunc2 = square.andThen(add);
        log.info("newFunc2: {}", newFunc2.apply(2));
    }
}
