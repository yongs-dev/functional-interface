package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.Procedure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/*
 * 익명 클래스의 경우 $로 구분하고 뒤에 숫자가 붙는다.
 * 람다의 경우 $$로 구분하고 뒤에 복잡한 문자가 붙는다.
 */
@Slf4j
public class InstanceTest {

    @Test
    void test() {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                log.info("Hello Anonymous class");
            }
        };
        log.info("class.class = {}", procedure.getClass());
        log.info("class.instance = {}", procedure);

        Procedure lambda = () -> log.info("hello lambda");
        log.info("lambda.class = {}", lambda.getClass());
        log.info("lambda.instance = {}", lambda);
    }
}
