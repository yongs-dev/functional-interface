package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

// pure function : 입력 값이 같을 때 결과 값이 항상 동일하다
@Slf4j
public class PureFunctionTest1 {

    @Test
    void test() {
        Function<Integer, Integer> func = x -> x * 2;
        log.info("result1 = {}", func.apply(10));
        log.info("result2 = {}", func.apply(10));
    }
}
