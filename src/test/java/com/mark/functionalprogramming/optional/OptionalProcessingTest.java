package com.mark.functionalprogramming.optional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
public class OptionalProcessingTest {

    @Test
    void test() {
        // 예제 : 문자열 "Hello"가 있는 Optional과 비어있는 Optional 준비
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 아무 일도 하지 않음
        log.info("=== 1. ifPresent() ===");
        optValue.ifPresent(v -> log.info("optValue: {}", v));
        optEmpty.ifPresent(v -> log.info("optEmpty: {}", v));

        // 값이 존재하면 Consumer 실행, 없으면 Runnalbe 실행
        log.info("=== 2. ifPresentOrElse() ===");
        optValue.ifPresentOrElse(
                v -> log.info("optValue: {}", v),
                () -> log.info("optValue는 비어있음")
        );
        optEmpty.ifPresentOrElse(
                v -> log.info("optEmpty: {}", v),
                () -> log.info("optEmpty는 비어있음")
        );

        // 값이 있으면 function 적용 후 Optional 반환, 없으면 Optional.empty()
        log.info("=== 3. map() ===");
        log.info("optValue.map(String::length): {}", optValue.map(String::length));
        log.info("optEmpty.map(String::length): {}", optEmpty.map(String::length));

        // map()과 유사하나, 이미 Optional을 반환하는 경우 중첩을 제거
        log.info("=== 4. flatMap() ===");
        log.info("nestedOpt: {}", optValue.map(s -> Optional.of(s)));
        log.info("flattenedOpt: {}", optValue.flatMap(s -> Optional.of(s)));

        // 값이 있고 조건을 만족하면 그 값을 그대로, 불만족시 Optional.empty()
        log.info("=== 5. filter() ===");
        log.info("optValue.filter(s -> s.startsWith(\"H\")): {}", optValue.filter(s -> s.startsWith("H")));
        log.info("optValue.filter(s -> s.startsWith(\"X\")): {}", optValue.filter(s -> s.startsWith("X")));

        // 값이 있으면 단일 요소 스트림, 없으면 빈 스트림
        log.info("=== 6. stream() ===");
        optValue.stream().forEach(s -> log.info("optValue.stream(): {}", s));
        optEmpty.stream().forEach(s -> log.info("optEmpty.stream(): {}", s));

    }
}
