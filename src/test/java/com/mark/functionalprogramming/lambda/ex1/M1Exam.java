package com.mark.functionalprogramming.lambda.ex1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class M1Exam {

    @Test
    void test() {
        greeting("Good Morning");
        greeting("Good Afternoon");
        greeting("Good Evening");

    }

    static void greeting(String message) {
        log.info("=== 시작 ===");
        log.info(message);
        log.info("=== 끝 ===");
    }
}
