package com.mark.functionalprogramming.stream.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class DuplicateExecutionTest {

    @Test
    void test() {
        // 스트림 중복 실행 확인
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(n -> log.info("{}", n)); // 1. 최초 실행
        
//        stream.forEach(n -> log.info("{}", n)); // 2. 중복 실행 오류. -> java.lang.IllegalStateException: stream has already been operated upon or closed

        // 대안 : 대상 리시트를 스트림으로 새로 생성해서 사용
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream.of(list).forEach(n -> log.info("{}", n));
        Stream.of(list).forEach(n -> log.info("{}", n));
    }
}
