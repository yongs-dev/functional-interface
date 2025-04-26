package com.mark.functionalprogramming.lambda.ex3;

import com.mark.functionalprogramming.lambda.ex2.StringFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class BuildGreeterExample {

    @Test
    void test() {
        log.info(buildGreeter("Hello").apply("Java"));
        log.info(buildGreeter("Hi").apply("Lambda"));
    }

    static StringFunction buildGreeter(String greeting) {
        return name -> greeting + ", " + name;
    }
}
