package com.mark.functionalprogramming.defaultmethod.ex3;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class NotifierTestV3 {

    @Test
    void test() {
        List<Notifier> notifiers = List.of(new EmailNotifier(), new SMSNotifier(), new AppPushNotifier());
        notifiers.forEach(n -> n.notify("서비스 가입을 환영합니다."));

        LocalDateTime scheduleTime = LocalDateTime.now().plusDays(1);
        notifiers.forEach(n -> n.scheduleNotification("hello!", scheduleTime));
    }
}
