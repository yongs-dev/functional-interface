package com.mark.functionalprogramming.lambda.lambda4;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

@Slf4j
public class PrimitiveFunction {

    @Test
    void test() {
        // 기본형 매개변수, IntFunction, LongFunction, DoubleFunction
        IntFunction<String> function = x -> "숫자: " + x;
        log.info("function.apply(100): {}", function.apply(100));

        // 기본형 반환, ToIntFunction, ToLongFunction, ToDoubleFunction
        ToIntFunction<String> toIntFunction = s -> s.length();
        log.info("toIntFunction.applyAsInt(\"hello\"): {}", toIntFunction.applyAsInt("hello"));
        
        // 기본형 매개변수, 기본형 반환
        IntToLongFunction intToLongFunction = x -> x * 100L;
        log.info("intToLongFunction.applyAsLong(10): {}", intToLongFunction.applyAsLong(10));

        // IntUnaryOperator: int -> int
        IntUnaryOperator intUnaryOperator = x -> x * 100;
        log.info("intUnaryOperator.applyAsInt(100): {}", intUnaryOperator.applyAsInt(100));

        // etc. IntConsumer, IntSupplier, IntPredicate
    }
}
