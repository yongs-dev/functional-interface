package com.mark.functionalprogramming.stream.basic;

import com.mark.functionalprogramming.lambda.lambda5.MyStreamV3;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class LazyEvalTestV2 {

    @Test
    void test() {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        ex1(data);
        ex2(data);
    }

    private void ex1(List<Integer> data) {
        log.info("=== MyStreamV3 시작 ===");

        MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    log.info("filter() 실행: {} ({})", i, isEven);
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    log.info("map() 실행: {} -> {}", i, mapped);
                    return mapped;
                });

//        log.info("result = {}", result);
        log.info("=== MyStreamV3 종료 ===");
    }

    private void ex2(List<Integer> data) {
        log.info("=== Stream API 시작 ===");
        data.stream()
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    log.info("filter() 실행: {} ({})", i, isEven);
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    log.info("map() 실행: {} -> {}", i, mapped);
                    return mapped;
                });

//        log.info("result = {}", result);
        log.info("=== Stream API 종료 ===");
    }
}
