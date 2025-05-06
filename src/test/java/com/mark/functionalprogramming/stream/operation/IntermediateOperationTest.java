package com.mark.functionalprogramming.stream.operation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class IntermediateOperationTest {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // 1. filter
        log.info("1. filter - 짝수만 선택");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> log.info("{}", n));

        log.info("2. map - 각 숫자를 제곱");
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> log.info("{}", n));
        
        log.info("3. distinct - 중복 제거");
        numbers.stream()
                .distinct()
                .forEach(n -> log.info("{}", n));

        log.info("4. sorted - 기본 정렬");
        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .sorted()
                .forEach(n -> log.info("{}", n));
        
        log.info("5. sorted - 커스텀 정렬");
        Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> log.info("{}", n));

        log.info("6. peek - 동작 확인용");
        numbers.stream()
                .peek(n -> log.info("before: {}", n))
                .map(n -> n * n)
                .peek(n -> log.info("after: {}", n))
                .limit(5)
                .forEach(n -> log.info("최종 값: {}", n));
        
        log.info("7. limit - 처음 N개 요소만");
        numbers.stream()
                .limit(5)
                .forEach(n -> log.info("{}", n));
        
        log.info("8. skip - 처음 N개 요소를 건너뛰기");
        numbers.stream()
                .skip(5)
                .forEach(n -> log.info("{}", n));

        log.info("9. takeWhile (Java 9+) - N 보다 작은 동안만 선택");
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> log.info("{}", n));

        log.info("10. dropWhile (Java 9+) - N 보다 작은 동안 건너뛰기");
        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> log.info("{}", n));
    }
}
