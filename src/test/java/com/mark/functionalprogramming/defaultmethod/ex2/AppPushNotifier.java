package com.mark.functionalprogramming.defaultmethod.ex2;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class AppPushNotifier implements Notifier {

    @Override
    public void notify(String message) {
        log.info("[APP] {}", message);
    }

    @Override
    public void scheduleNotification(String message, LocalDateTime scheduleTime) {
        log.info("[APP 전용 스케줄링] message: {}, time: {}", message, scheduleTime);
    }
}
