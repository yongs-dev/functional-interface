package com.mark.functionalprogramming.lambda.lambda6;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class OuterClassTest {

    @Test
    public void test() {
        OuterClassTest outerClass = new OuterClassTest();
        outerClass.execute();
    }

    private final String message = "외부 클래스";

    public void execute() {
        // 1. 익명 클래스
        Runnable anonymous = new Runnable() {

            private final String message = "익명 클래스";

            @Override
            public void run() {
                // 익명 클래스에서의 this는 익명 클래스의 인스턴스를 가리킴
                log.info("[익명 클래스] this: {}", this);
                log.info("[익명 클래스] this.getClass: {}", this.getClass());
                log.info("[익명 클래스] this.message: {}", this.message);
            }
        };

        // 2. 람다 예시
        Runnable lambda = () -> {
            // 람다에서의 this는 람다가 선언된 클래스의 인스턴스(즉, 외부 클래스) 가리킴
            log.info("[람다] this: {}", this);
            log.info("[람다] this.getClass: {}", this.getClass());
            log.info("[람다] this.message: {}", this.message);
        };

        anonymous.run();
        lambda.run();
        log.info("==============================");
    }
}
