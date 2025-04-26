package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.Procedure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LambdaSimple2 {

    @Test
    void simpleLambda() {
        Procedure procedure1 = () -> {
            log.info("Hello lambda");
        };
        procedure1.run();
        
        // 단일 표현식은 중괄호 생략 가능
        Procedure procedure2 = () -> log.info("Hello Lambda");
        procedure2.run();
    }
}
