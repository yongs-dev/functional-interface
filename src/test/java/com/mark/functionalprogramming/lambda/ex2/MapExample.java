package com.mark.functionalprogramming.lambda.ex2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MapExample {

    @Test
    void test() {
        List<String> numbers = List.of("hello", "java", "lambda");
        log.info("원본 리스트: {}", numbers);

        log.info("대문자 변환 결과: {}", map(numbers, String::toUpperCase));
        log.info("특수문자 데코 결과: {}", map(numbers, (v) -> "***" + v + "***"));
    }

    static List<String> map(List<String> list, StringFunction function) {
        List<String> result = new ArrayList<>();

        for (String v : list) {
            result.add(function.apply(v));
        }


        return result;
    }
}
