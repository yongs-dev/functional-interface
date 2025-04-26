package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class FunctionTest {

    @Test
    void test() {
        // 익명 클래스
        Function<String, Integer> function1 = new Function<>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        log.info("{}", function1.apply("hello"));

        // 람다
        Function<String, Integer> function2 = s -> s.length();
        log.info("{}", function2.apply("hello"));
    }
}
