package com.mark.functionalprogramming.parallel;

import com.mark.functionalprogramming.util.MyLogger;

public class HeavyJob {

    public static int heavyTask(int i) {
        MyLogger.log("calculate " + i + " -> " + i * 10);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}

        return i * 10;
    }

    public static int heavyTask(int i, String name) {
        MyLogger.log("[" + name +  "] " + i + " -> " + i * 10);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}

        return i * 10;
    }
}
