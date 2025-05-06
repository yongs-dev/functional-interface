package com.mark.functionalprogramming.lambda.lambda5.map;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MapTestV1 {

    @Test
    void test() {
        List<String> list = List.of("1", "12", "123", "1234");

        log.info("numbers: {}", mapStringToInteger(list));
        log.info("lengths: {}", mapStringToLength(list));
    }

    private List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : list) {
            numbers.add(Integer.valueOf(s));
        }

        return numbers;
    }

    private List<Integer> mapStringToLength(List<String> list) {
        List<Integer> lengths = new ArrayList<>();

        for (String s : list) {
            lengths.add(s.length());
        }

        return lengths;
    }
}
