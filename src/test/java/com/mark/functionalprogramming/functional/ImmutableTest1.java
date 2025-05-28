package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ImmutableTest1 {

    @Test
    void test() {
        MutablePerson m1 = new MutablePerson("Yong", 10);
        MutablePerson m2 = m1;
        m2.setAge(11);
        log.info("m1: {}", m1);
        log.info("m2: {}", m2);

        ImmutablePerson i1 = new ImmutablePerson("Yong", 20);
        ImmutablePerson i2 = i1.withAge(21);
        log.info("i1: {}", i1);
        log.info("i2: {}", i2);
    }
}
