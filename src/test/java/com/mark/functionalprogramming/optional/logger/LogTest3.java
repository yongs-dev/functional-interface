package com.mark.functionalprogramming.optional.logger;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LogTest3 {

    @Test
    void test() {
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(() -> value100() + value200());

        log.info("=== 디버그 모드 끄기 ===");
        logger.setDebug(false);
        logger.debug(() -> value100() + value200());
    }

    int value100() {
        log.info("called value100");
        return 100;
    }

    int value200() {
        log.info("called value200");
        return 200;
    }
}
