package com.mark.functionalprogramming.lambda.start;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Ex0RefTest {

    @Test
    void start() {
        hello("Hello Java");
        hello("Hello Spring");
    }

    public static void hello(String message) {
        log.info("프로그램 시작");

        log.info(message);

        log.info("프로그램 종료");
    }
}
