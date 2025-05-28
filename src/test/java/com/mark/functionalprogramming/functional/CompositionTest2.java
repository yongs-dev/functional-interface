package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class CompositionTest2 {

    @Test
    void test() {
        // 1. String -> Integer
        Function<String, Integer> parseInt = Integer::parseInt;

        // 2. Integer -> Integer (제곱)
        Function<Integer, Integer> square = x -> x * x;

        // 3. Integer -> String (문자열로 변환)
        Function<Integer, String> toString = x -> "결과: " + x;

        // compose 혹은 andThen을 이용하여 합성
        // parseInt -> square -> toString 순서로 하고 싶다면 andThen() 사용
        Function<String, String> finalFunc = parseInt
                .andThen(square)
                .andThen(toString);
        log.info("result1: {}", finalFunc.apply("5"));
        log.info("result2: {}", finalFunc.apply("10"));

        // 또 다른 조합으로 사용 가능
        Function<String, Integer> stringToSquareFunc = parseInt.andThen(square);
        log.info("result3: {}", stringToSquareFunc.apply("5"));
    }
}
