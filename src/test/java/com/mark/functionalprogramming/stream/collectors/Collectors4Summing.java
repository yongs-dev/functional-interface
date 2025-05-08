package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class Collectors4Summing {

    @Test
    void test() {
        Long count1 = Stream.of(1, 2, 3).collect(Collectors.counting());
        log.info("count1: {}", count1);

        long count2 = Stream.of(1, 2, 3).count();
        log.info("count2: {}", count2);

        Double average1 = Stream.of(1, 2, 3).collect(Collectors.averagingInt(i -> i));
        log.info("average1: {}", average1);

        // 기본형 특화 스트림으로 변환
        double average2 = Stream.of(1, 2, 3).mapToInt(i -> i).average().getAsDouble();
        log.info("average2: {}", average2);

        // 기본형 특화 스트림 사용
        double average3 = IntStream.of(1, 2, 3).average().getAsDouble();
        log.info("average3: {}", average3);

        // 통계
        IntSummaryStatistics stats = Stream.of("Apple", "Banana", "Tomato").collect(Collectors.summarizingInt(String::length));
        log.info("{}", stats.getCount());
        log.info("{}", stats.getSum());
        log.info("{}", stats.getMin());
        log.info("{}", stats.getMax());
        log.info("{}", stats.getAverage());


    }
}
