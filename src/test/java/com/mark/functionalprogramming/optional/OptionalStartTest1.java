package com.mark.functionalprogramming.optional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class OptionalStartTest1 {

    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Yong");
        map.put(2L, "Kim");
    }

    @Test
    void test() {
        findAndPrint(1L); // 값이 있는 경우
        findAndPrint(3L); // 값이 없는 경우
    }

    // 이름이 있으면 이름을 대문자로 출력. 없으면 "UNKNOWN"을 출력
    void findAndPrint(Long id) {
        String name = findNameById(id);
        // 1. NPE 발생
//        log.info("name = {}", name);

        // 2. 분기문을 활용한 null 체크
        log.info("{} = {}", id, name == null ? "UNKNOWN" : name.toUpperCase());
    }

    String findNameById(Long id) {
        return map.get(id);
    }
}
