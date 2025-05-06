package com.mark.functionalprogramming.stream.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class ImmutableTest {

    @Test
    void test() {
        List<Integer> originList = List.of(1, 2, 3, 4, 5);
        log.info("originList = {}", originList);

        List<Integer> filteredList = originList.stream().filter(n -> n % 2 == 0).toList();
        log.info("filteredList = {}", filteredList);
        log.info("originList = {}", originList);
    }
}
