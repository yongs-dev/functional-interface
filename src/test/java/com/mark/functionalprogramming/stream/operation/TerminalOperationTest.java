package com.mark.functionalprogramming.stream.operation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class TerminalOperationTest {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        log.info("1. collect - List 수집");
        List<Integer> evenNumber1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        log.info("짝수 리스트 : {}", evenNumber1);

        log.info("2. toList (Java 16+)");
        List<Integer> evenNumber2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        log.info("짝수 리스트 : {}", evenNumber2);

        log.info("3. toArray - 배열로 변환");
        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        log.info("짝수 배열 : {}", Arrays.toString(arr));

        log.info("4. forEach - 각 요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);

        log.info("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        log.info("5보다 큰 숫자 : {}", count);

        log.info("6. reduce - 요소들의 합");
        log.info("초기 값이 없는 reduce");
        Integer sum1 = numbers.stream()
                .reduce((a, b) -> a + b)
                .get();
        log.info("합계(초기 값 없음): {}", sum1);

        log.info("초기 값이 있는 reduce");
        Integer sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        log.info("합계(초기 값 있음): {}", sum2);
        
        log.info("7. min - 최솟값");
        Integer min = numbers.stream()
                .min(Integer::compareTo)
                .get();
        log.info("최솟값: {}", min);

        log.info("8. max - 최대값");
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        log.info("최대값: {}", max);
        
        log.info("9. findFirst() - 첫 번째 요소");
        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst()
                .get();
        log.info("5보다 큰 첫 번째 숫자: {}", first);

        log.info("10. findAny() - 아무 요소나 하나 찾기");
        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny()
                .get();
        log.info("5보다 큰 첫 번째 숫자: {}", any);

        log.info("11. anyMatch - 조건을 만족하는 요소 존재 여부");
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        log.info("짝수가 있나: {}", hasEven);

        log.info("12. allMatch - 모든 요소가 조건을 만족하는지");
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        log.info("모든 요소가 양수인가: {}", allPositive);

        log.info("13. noneMatch - 조건을 만족하는 요소가 없는지");
        boolean noNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        log.info("음수가 없는가: {}", noNegative);
    }
}
