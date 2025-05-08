package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class Collectors4MinMax {

    @Test
    void test() {
        Integer max1 = Stream.of(1, 2, 3).collect(Collectors.maxBy((i1, i2) -> i1.compareTo(i2))).get();
        log.info("max1: {}", max1);

        Integer max2 = Stream.of(1, 2, 3).max(Comparator.naturalOrder()).get();
        log.info("max2: {}", max2);

        Integer max3 = Stream.of(1, 2, 3).max(Integer::compare).get();
        log.info("max3: {}", max3);

        // 기본형 특화 스트림 사용
        int max4 = IntStream.of(1, 2, 3).max().getAsInt();
        log.info("max4: {}", max4);
    }
}
