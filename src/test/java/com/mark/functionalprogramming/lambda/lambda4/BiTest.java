package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.*;

@Slf4j
public class BiTest {

    @Test
    void test() {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        log.info("addition1.apply(1, 2): {}", add.apply(1, 2));

        BiConsumer<String, Integer> repeat = (c, n) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(c.repeat(Math.max(0, n)));
            log.info("repeat.accept(\"*\", 5): {}", sb);

        };
        repeat.accept("*", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        log.info("isGreater.test(10, 5): {}", isGreater.test(10, 5));
        isGreater.test(10, 5);
    }
}
