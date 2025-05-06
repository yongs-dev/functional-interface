package com.mark.functionalprogramming.stream.operation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class MapVsFlatMapTest {

    @Test
    void test() {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );
        log.info("outerList: {}", outerList);

        // for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (Integer i : list) {
                forResult.add(i);
            }
        }
        log.info("forResult: {}", forResult);

        // map
        List<Stream<Integer>> mapResult = outerList.stream()
                .map(list -> list.stream())
                .toList();
        log.info("mapResult: {}", mapResult);

        // flatMap
        List<Integer> flatMapList = outerList.stream()
                .flatMap(list -> list.stream())
                .toList();
        log.info("flatMapList: {}", flatMapList);
    }
}
