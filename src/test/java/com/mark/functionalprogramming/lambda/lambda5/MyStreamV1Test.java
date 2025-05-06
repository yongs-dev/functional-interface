package com.mark.functionalprogramming.lambda.lambda5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class MyStreamV1Test {

    @Test
    public void test() {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = returnValue(numbers);
        log.info("result: {}", result);

        List<Integer> methodChainResult = methodChain(numbers);
        log.info("methodChainResult: {}", methodChainResult);
    }

    private List<Integer> returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filtered = stream.filter(n -> n % 2 == 0);
        MyStreamV1 mapped = filtered.map(n -> n * 2);
        return mapped.toList();
    }

    private List<Integer> methodChain(List<Integer> numbers) {
        return new MyStreamV1(numbers)
                .filter(n1 -> n1 % 2 == 0)
                .map(n -> n * 2)
                .toList();
    }
}
