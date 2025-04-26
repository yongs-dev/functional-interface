package com.mark.functionalprogramming.lambda.ex1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class M2Exam {

    @Test
    void test() {
        print(10, "KG");
        print(50, "KG");
        print(200, "G");
        print(40, "G");
    }

    static void print(int weight, String unit) {
        log.info("무게: {}{}", weight, unit);
    }
}
