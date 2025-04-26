package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

@Slf4j
public class PredicateTest {

    @Test
    void test() {
        // 익명 클래스
        Predicate<Integer> predicate1 = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        log.info("predicate1.test(10): {}", predicate1.test(10));

        // 람다
        Predicate<Integer> predicate2 = v -> v % 2 == 0;
        log.info("predicate2.test(10): {}", predicate2.test(10));
    }
}
