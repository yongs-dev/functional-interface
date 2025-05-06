package com.mark.functionalprogramming.stream.operation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Slf4j
public class PrimitiveStreamTest {

    @Test
    void test() {
        // 기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)
        IntStream.of(1, 2, 3, 4, 5)
                .forEach(n -> log.info("{}", n));

        // 범위 생성 메서드(IntStream, LongStream, DoubleStream)
        IntStream range1 = IntStream.range(1, 6);// [1, 2, 3, 4, 5]
        IntStream range2 = IntStream.rangeClosed(1, 5);// [1, 2, 3, 4, 5]
        range1.forEach(n -> log.info("{}", n));
        range2.forEach(n -> log.info("{}", n));

        // 1. 통계 관련 메서드(sum, average, max, min, count)
        log.info("sum: {}", IntStream.range(1, 6).sum());
        log.info("average: {}", IntStream.range(1, 6).average().getAsDouble());
        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        log.info("합계: {}", stats.getSum());
        log.info("평균: {}", stats.getAverage());
        log.info("최대값: {}", stats.getMax());
        log.info("최소값: {}", stats.getMin());
        log.info("개수: {}", stats.getCount());
        
        // 2. 타입 변환 메서드
        LongStream longStream = IntStream.range(1, 6).asLongStream();
        DoubleStream doubleStream = IntStream.range(1, 6).asDoubleStream();
        Stream<Integer> boxedStream = IntStream.range(1, 6).boxed();

        // 3. 기본형 특화 매핑
        LongStream mappedLong = IntStream.range(1, 6).mapToLong(n -> n * 10L);
        DoubleStream mappedDouble = IntStream.range(1, 6).mapToDouble(n -> n * 1.5);
        Stream<String> mappedObject = IntStream.range(1, 6).mapToObj(n -> "Number: " + n);

        // 4. 객체 스트림 -> 기본형 특화 스트림으로 매핑
        IntStream intStream = Stream.of(1, 2, 3, 4, 5).mapToInt(n -> n);

        // 5. 객체 스트림 -> 기본형 특화 스트림으로 매핑 활용
        long count = Stream.of(1, 2, 3, 4, 5).mapToInt(n -> n).count();
    }
}
