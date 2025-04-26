package com.mark.functionalprogramming.lambda.lambda1;

import com.mark.functionalprogramming.lambda.Procedure;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ProcedureTest1 {

    @Test
    void test() {
        Procedure procedure = new Procedure() {

            @Override
            public void run() {
                log.info("Hello! lambda");
            }
        };

        procedure.run();
    }
}
