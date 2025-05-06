package com.mark.functionalprogramming.lambda.lambda5.map;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Slf4j
public class MapTestV2 {

    @Test
    void test() {
        List<String> list = List.of("1", "12", "123", "1234");

        log.info("numbers: {}", map(list, s -> Integer.valueOf(s)));
        log.info("lengths: {}", map(list, s -> s.length()));
    }

    private List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(mapper.apply(s));
        }

        return numbers;
    }
}
