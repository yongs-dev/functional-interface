package com.mark.functionalprogramming.lambda.start;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Random;

@Slf4j
public class Ex1Test {

    @Test
    void start() {
        helloDice();
        helloSum();
    }

    public static void helloDice() {
        long startNs = System.nanoTime();

        int randomValue = new Random().nextInt(6) + 1;
        log.info("주사위 = {}", randomValue);

        long endNs = System.nanoTime();
        log.info("실행 시간 = {}", (endNs - startNs) + "ns");
    }

    public static void helloSum() {
        long startNs = System.nanoTime();

        for (int i = 1; i <= 3; i++) {
            log.info("i = {}", i);
        }

        long endNs = System.nanoTime();
        log.info("실행 시간 = {}", (endNs - startNs) + "ns");
    }
}
