package com.mark.functionalprogramming.defaultmethod.ex2;

import java.time.LocalDateTime;

public interface Notifier {

    void notify(String message);

    void scheduleNotification(String message, LocalDateTime scheduleTime);
}
