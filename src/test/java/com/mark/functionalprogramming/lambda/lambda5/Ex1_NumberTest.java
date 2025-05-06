package com.mark.functionalprogramming.lambda.lambda5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Ex1_NumberTest {

    @Test
    public void test() {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> directResult = direct(numbers);
        log.info("directResult: {}", directResult);

        List<Integer> lambdaResult = lambda(numbers);
        log.info("lambdaResult: {}", lambdaResult);
    }

    private List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                result.add(number * 2);
            }
        }

        return result;
    }

    private List<Integer> lambda(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
    }
}
