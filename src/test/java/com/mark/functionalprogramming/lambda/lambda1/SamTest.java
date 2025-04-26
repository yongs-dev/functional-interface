package com.mark.functionalprogramming.lambda.lambda1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/*
 * SAM (Single Abstract Method)
 * 메서드를 오직 하나만 가지는 인터페이스(Functional-Interface)로 SAM Interface는 람다로 사용 가능하다.
 */
@Slf4j
public class SamTest {

    @Test
    void test() {
        SamInterface sam = () -> {
            log.info("sam");
        };

        sam.run();

        /*
        // compile error: incompatible types: NotSamInterface is not a functional interface
        NotSamInterface notSam = () -> {
            log.info("not sam");
        };
        */
    }
}
