package com.mark.functionalprogramming.optional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
public class OptionalRetrievalTest {

    @Test
    void test() {
        // 예제 : 문자열 "Hello"가 있는 Optional과 비어있는 Optional 준비
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // isPresent() : 값이 있으면 true
        log.info("=== 1. isPresent() / isEmpty() ===");
        log.info("optValue.isPresent(): {}", optValue.isPresent());
        log.info("optEmpty.isPresent(): {}", optEmpty.isPresent());
        log.info("optEmpty.isEmpty(): {}", optEmpty.isEmpty());

        // get() : 직접 내부 값을 꺼냄, 값이 없으면 예외 (NoSuchElementException)
        log.info("=== 2. get() ===");
        log.info("optValue.get(): {}", optValue.get());
//        log.info("optEmpty.get(): {}", optEmpty.get());

        // 값이 있으면 그 값, 없으면 지정된 기본값 사용
        log.info("=== 3. orElse() ===");
        log.info("optValue.orElse(): {}", optValue.orElse("Default"));
        log.info("optEmpty.orElse(): {}", optEmpty.orElse("Default"));

        // 값이 없을 떄만 람다(Supplier)가 실행되어 기본값 생성
        log.info("=== 4. orElseGet() ===");
        log.info("optValue.orElseGet(): {}", optValue.orElseGet(() -> {
            log.info("람다 호출 - optValue");
            return "New Value";
        }));
        log.info("optEmpty.orElseGet(): {}", optEmpty.orElseGet(() -> {
            log.info("람다 호출 - optEmpty");
            return "New Value";
        }));
        
        // 값이 있으면 반환, 없으면 예외 발생
        log.info("=== 5. orElseThrow() ===");
        log.info("optValue.orElseThrow(): {}", optValue.orElseThrow(() -> new RuntimeException("optValue 값이 없음")));
//        log.info("optEmpty.orElseThrow(): {}", optEmpty.orElseThrow(() -> new RuntimeException("optEmpty 값이 없음")));

        // Optional을 반환
        log.info("=== 6. or() ===");
        log.info("optValue.or(): {}", optValue.or(() -> Optional.of("optValue Fallback")));
        log.info("optEmpty.or(): {}", optEmpty.or(() -> Optional.of("optEmpty Fallback")));
    }
}
