package com.mark.functionalprogramming.lambda.start;

import com.mark.functionalprogramming.lambda.Procedure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Random;

// 익명 클래스 사용
@Slf4j
public class Ex1RefTestV2 {

    @Test
    void start() {
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                log.info("주사위 = {}", randomValue);
            }
        };

        Procedure sum = new Procedure() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    log.info("i = {}", i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        log.info("실행 시간 = {}", (endNs - startNs) + "ns");
    }
}
