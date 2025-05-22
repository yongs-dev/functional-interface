package com.mark.functionalprogramming.defaultmethod.ex1;

import org.junit.jupiter.api.Test;

import java.util.List;

public class NotifierTestV1 {

    @Test
    void test() {
        List<Notifier> notifiers = List.of(new EmailNotifier(), new SMSNotifier(), new AppPushNotifier());
        notifiers.forEach(n -> n.notify("서비스 가입을 환영합니다."));
    }
}
