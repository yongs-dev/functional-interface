package com.mark.functionalprogramming.lambda.lambda5.map;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class MapTestV3 {

    @Test
    void test() {
        List<String> list = List.of("1", "12", "123", "1234");

        log.info("numbers: {}", StringToIntegerMapper.map(list, s -> Integer.valueOf(s)));
        log.info("lengths: {}", StringToIntegerMapper.map(list, s -> s.length()));
    }
}
