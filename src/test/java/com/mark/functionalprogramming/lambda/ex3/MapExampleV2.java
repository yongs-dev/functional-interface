package com.mark.functionalprogramming.lambda.ex3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

@Slf4j
public class MapExampleV2 {

    @Test
    void test() {
        List<String> numbers = List.of("hello", "java", "lambda");
        log.info("원본 리스트: {}", numbers);

        log.info("대문자 변환 결과: {}", map(numbers, String::toUpperCase));
        log.info("특수문자 데코 결과: {}", map(numbers, (v) -> "***" + v + "***"));
    }

    static List<String> map(List<String> list, UnaryOperator<String> function) {
        List<String> result = new ArrayList<>();

        for (String v : list) {
            result.add(function.apply(v));
        }

        return result;
    }
}
