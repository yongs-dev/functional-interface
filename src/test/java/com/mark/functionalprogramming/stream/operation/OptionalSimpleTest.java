package com.mark.functionalprogramming.stream.operation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
public class OptionalSimpleTest {

    @Test
    void test() {
        Optional<Integer> optional1 = Optional.of(10);
        log.info("optional1: {}", optional1);

        if (optional1.isPresent()) {    // 값이 있는지 확인할 수 있는 안전한 메서드 제공
            Integer i = optional1.get();
            log.info("i: {}", i);
        }

        Optional<Object> optional2 = Optional.ofNullable(null);
        log.info("optional2: {}", optional2);

        if (optional2.isPresent()) {
            Object o = optional2.get();
            log.info("o: {}", o);
        }

        // 값이 없는 Optional에서 get()을 호출하면 NoSuchElementException 발생한다.
        Object o2 = optional2.get();
        log.info("o2: {}", o2);
    }
}
