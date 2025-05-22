package com.mark.functionalprogramming.defaultmethod.ex1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppPushNotifier implements Notifier {

    @Override
    public void notify(String message) {
        log.info("[APP] {}", message);
    }
}
