package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class ImmutableTest2 {

    @Test
    void test() {
        MutablePerson m1 = new MutablePerson("Yong", 10);
        MutablePerson m2 = new MutablePerson("Park", 20);

        List<MutablePerson> originList = List.of(m1, m2);
        log.info("originList: {}", originList);

        List<MutablePerson> resultList = originList.stream()
                .map(p -> {
                    p.setAge(p.getAge() + 1);
                    return p;
                })
                .toList();

        log.info("=== 실행 후 ===");
        log.info("originList: {}", originList); // 원본도 변경
        log.info("resultList: {}", resultList);
    }
}
