package com.mark.functionalprogramming.functional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SideEffectListTest {

    @Test
    void test() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");

        log.info("before list1 = {}", list1);
        changeList1(list1);
        log.info("after list1 = {}", list1);

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");

        log.info("before list2 = {}", list2);
        List<String> result = changeList2(list2);
        log.info("after list2 = {}", list2);
        log.info("result = {}", result);
    }

    // 리스트 원본을 직접 변경함으로써 부수 효과 발생
    private void changeList1(List<String> list) {
        list.replaceAll(s -> s + "_complete");
    }

    // 새로운 리스트를 생성해서 반환함으로써 원본 리스트를 변경하지 않는다.
    private List<String> changeList2(List<String> list) {
        return list.stream().map(s -> s + "_complete").toList();
    }
}
