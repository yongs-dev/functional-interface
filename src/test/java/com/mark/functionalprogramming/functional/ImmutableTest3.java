package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class ImmutableTest3 {

    @Test
    void test() {
        ImmutablePerson m1 = new ImmutablePerson("Yong", 10);
        ImmutablePerson m2 = new ImmutablePerson("Park", 20);

        List<ImmutablePerson> originList = List.of(m1, m2);
        log.info("originList: {}", originList);

        List<ImmutablePerson> resultList = originList.stream()
                .map(p -> p.withAge(p.getAge() + 1))
                .toList();

        log.info("=== 실행 후 ===");
        log.info("originList: {}", originList); // 원본도 변경
        log.info("resultList: {}", resultList);
    }
}
