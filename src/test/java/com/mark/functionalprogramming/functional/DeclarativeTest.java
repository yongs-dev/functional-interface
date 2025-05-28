package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DeclarativeTest {

    // 짝수면 값을 제곱
    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 명령형: 루프 및 조건 검사로 처리. 어떻게(HOW) 처리할지 구체적으로 작성
        List<Integer> result1 = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                result1.add(num * num);
            }
        }
        log.info("Imperative Result: {}", result1);

        // 선언형: 스트림 API 처리. 무엇(WHAT)을 할지에 집중
        List<Integer> result2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        log.info("Declarative Result: {}", result2);
    }
}
