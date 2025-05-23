package com.mark.functionalprogramming.optional.logger;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LogTest1 {

    @Test
    void test() {
        Logger logger = new Logger();
        logger.setDebug(true);
        logger.debug(10 + 20);

        log.info("=== 디버그 모드 끄기 ===");
        logger.setDebug(false);
        logger.debug(100 + 200);
    }
}
