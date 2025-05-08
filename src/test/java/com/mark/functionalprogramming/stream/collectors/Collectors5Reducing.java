package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Collectors5Reducing {

    @Test
    void test() {
        List<String> names = List.of("a", "b", "c", "d");

        // 컬렉션의 리듀싱은 주로 다운 스트림에 활용
        // 모든 이름을 하나의 문자열로 이어 붙이기
        String joined1 = names.stream().collect(Collectors.reducing((s1, s2) -> s1 + ", " + s2)).get();
        log.info("joined1: {}", joined1);

        String joined2 = names.stream().reduce((s1, s2) -> s1 + ", " + s2).get();
        log.info("joined2: {}", joined2);

        // 문자열 전용 기능
        String joined3 = names.stream().collect(Collectors.joining(", "));
        log.info("joined3: {}", joined3);

        String joined4 = String.join(", ", names);
        log.info("joined4: {}", joined4);
    }
}
