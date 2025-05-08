package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Collectors2Map {

    @Test
    void test() {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato").collect(Collectors.toMap(
                name -> name,           // keyMapper
                name -> name.length()   // valueMapper
        ));
        log.info("map: {}", map1);

        // 키 중복 예외 : IllegalStateException
//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato").collect(Collectors.toMap(
//                name -> name,           // keyMapper
//                name -> name.length()   // valueMapper
//        ));
//        log.info("map2: {}", map2);

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato").collect(Collectors.toMap(
                name -> name, // keyMapper
                name -> name.length(), // valueMapper
                (oldValue, newValue) -> oldValue + newValue // 중복 될 경우 기존 값 + 새 값
        ));
        log.info("map3: {}", map3);

        // Map 타입 지정
        Map<String, Integer> map4 = Stream.of("Apple", "Banana", "Tomato").collect(Collectors.toMap(
                name -> name, // keyMapper
                name -> name.length(), // valueMapper
                (oldValue, newValue) -> oldValue + newValue, // 중복 될 경우 기존 값 + 새 값
                LinkedHashMap::new // 타입 지정
        ));
        log.info("map4: {}", map4.getClass());
    }
}
