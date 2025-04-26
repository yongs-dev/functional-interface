package com.mark.functionalprogramming.lambda.ex3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ComposeExample {

    @Test
    void test() {
        MyTransformer toUpper = String::toUpperCase;
        MyTransformer addDeco = s -> "***" + s + "***";

        MyTransformer compose = compose(toUpper, addDeco);

        log.info(compose.transform("hello"));
    }

    static MyTransformer compose(MyTransformer t1, MyTransformer t2) {
        return s -> t2.transform(t1.transform(s));
    }
}
