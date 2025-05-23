package com.mark.functionalprogramming.optional.logger;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;

@Slf4j
@Getter
@Setter
public class Logger {

    private boolean isDebug = false;

    // DEBUG로 설정한 경우에만 출력
    public void debug(Object message) {
        if (isDebug) log.info("[DEBUG] {}", message);
    }

    // DEBUG로 설정한 경우에만 출력 -> 람다를 받아서 실행
    public void debug(Supplier<?> supplier) {
        if (isDebug) log.info("[DEBUG] {}", supplier.get());
    }
}
