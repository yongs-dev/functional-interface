package com.mark.functionalprogramming.lambda.lambda6;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CaptureTest {

    @Test
    public void test() {
        final int final1 = 10; // 명시적 final
        int final2 = 20;       // 사실상(final): 재할당 (값 변경) 없음
        int changedVar = 30;   // 값이 변경되는 변수

        // 1. 익명 클래스에서의 캡처
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                log.info("[익명 클래스] - final1: {}", final1);
                log.info("[익명 클래스] - final2: {}", final2);

                // 컴파일 오류
//                log.info("[익명 클래스] - changedVar: {}", changedVar);
            }
        };

        Runnable lambda = () -> {
            log.info("[람다] - final1: {}", final1);
            log.info("[람다] - final2: {}", final2);

            // 컴파일 오류
//            log.info("[익명 클래스] - changedVar: {}", changedVar);
        };

        runnable.run();
        log.info("==========================================");
        lambda.run();

//        changedVar++;
    }
}
