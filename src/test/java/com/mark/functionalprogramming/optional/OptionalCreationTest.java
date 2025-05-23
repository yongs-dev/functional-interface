package com.mark.functionalprogramming.optional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
public class OptionalCreationTest {

    @Test
    void test() {
        // 1. of() : 값이 null이 아님이 확실할 때 사용. null 이면 NPE 발생
        String nonNullValue = "Hello Optional!";
        Optional<String> opt1 = Optional.of(nonNullValue);
        log.info("opt1: {}", opt1);

        // 2. ofNullable() : 값이 null일 수도 아닐 수도 있을 때
        Optional<String> opt2 = Optional.ofNullable("Hello!");
        Optional<String> opt3 = Optional.ofNullable(null);
        log.info("opt2: {}", opt2);
        log.info("opt3: {}", opt3);

        // 3. empty() : 비어있는 Optional을 명시적으로 생성
        Optional<String> opt4 = Optional.ofNullable(null);
        log.info("opt4: {}", opt4);

    }
}
