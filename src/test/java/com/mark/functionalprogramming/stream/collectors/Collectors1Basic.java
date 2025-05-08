package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Collectors1Basic {

    @Test
    void test() {
        // 수정 가능 리스트를 반환
        List<String> list = Stream.of("Java", "Spring", "JPA").collect(Collectors.toList());
        log.info("list: {}", list);

        // 수정 불가능 리스트 반환
        List<Integer> unmodifiableList = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableList());
//        unmodifiableList.add(4);
        log.info("unmodifiableList: {}", unmodifiableList);

        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3).collect(Collectors.toSet());
        log.info("set: {}", set);

        // 타입 지정 - TreeSet 정렬 상태를 유지
        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1).collect(Collectors.toCollection(TreeSet::new));
        log.info("treeSet: {}", treeSet);
    }
}
