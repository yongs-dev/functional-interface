package com.mark.functionalprogramming.optional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Random;

@Slf4j
public class OrElseGetTest {

    @Test
    void test() {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        log.info("=== 단순 계산===");
        Integer i1 = optValue.orElse(10 + 20); // 10 + 20 계산 후 버림
        Integer i2 = optEmpty.orElse(10 + 20); // 10 + 20 계산 후 사용
        log.info("i1: {}", i1);
        log.info("i2: {}", i2);
        
        // 값이 있으면 그 값, 없으면 지정된 기본값 사용
        log.info("=== orElse ===");
        log.info("값이 있는 경우");
        log.info("optValue.orElse(): {}", optValue.orElse(createData()));
        log.info("값이 없는 경우");
        log.info("optEmpty.orElse(): {}", optEmpty.orElse(createData()));

        // 값이 있으면 그 값, 없으면 지정된 람다 사용
        log.info("=== orElseGet ===");
        log.info("값이 있는 경우");
        log.info("optValue.orElseGet(): {}", optValue.orElseGet(this::createData));
        log.info("값이 없는 경우");
        log.info("optEmpty.orElseGet(): {}", optEmpty.orElseGet(this::createData));
    }

    int createData() {
        log.info("데이터를 생성합니다.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}

        int createValue = new Random().nextInt(100);
        log.info("데이터 생성이 완료됐습니다. 생성 값: {}", createValue);

        return createValue;
    }
}
