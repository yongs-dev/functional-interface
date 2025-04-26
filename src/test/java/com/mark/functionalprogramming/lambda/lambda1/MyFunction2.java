package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.MyFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class MyFunction2 {

    @Test
    void test() {
        MyFunction myFunction = (int a, int b) -> {
            return a + b;
        };

        int result = myFunction.apply(1, 2);
        log.info("result = {}", result);
    }
}
