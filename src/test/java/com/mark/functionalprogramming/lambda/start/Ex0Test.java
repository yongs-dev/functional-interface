package com.mark.functionalprogramming.lambda.start;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Ex0Test {

    @Test
    void start() {
        helloJava();
        helloSpring();
    }

    public static void helloJava() {
        log.info("프로그램 시작");
        log.info("Hello Java");
        log.info("프로그램 종료");
    }

    public static void helloSpring() {
        log.info("프로그램 시작");
        log.info("Hello Spring");
        log.info("프로그램 종료");
    }
}
