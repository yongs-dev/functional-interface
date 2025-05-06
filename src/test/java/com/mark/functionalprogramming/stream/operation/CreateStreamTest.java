package com.mark.functionalprogramming.stream.operation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class CreateStreamTest {

    @Test
    void test() {
        log.info("1. 컬렉션으로부터 생성");
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream1 = list.stream();
        stream1.forEach(s -> log.info("{}", s));

        log.info("2. 배열로부터 생성");
        String[] arr = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(s -> log.info("{}", s));

        log.info("3. Stream.of() 사용");
        Stream<String> stream3 = Stream.of("a", "b", "c");
        stream3.forEach(s -> log.info("{}", s));

        log.info("4. 무한 스트림 생성 - iterate()");
        // iterate: 초기값과 다음 값을 만드는 함수를 지정.
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(3).forEach(s -> log.info("{}", s));

        log.info("5. 무한 스트림 생성 - generate()");
        // generate: Supplier를 사용하여 무한하게 생성
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.limit(3).forEach(s -> log.info("{}", s));
    }
}
