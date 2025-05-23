package com.mark.functionalprogramming.optional;

import com.mark.functionalprogramming.optional.model.Address;
import com.mark.functionalprogramming.optional.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class AddressTest1 {

    @Test
    void test() {
        User user1 = new User("user1", null);
        User user2 = new User("user2", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    void printStreet(User user) {
        String userStreet = getUserStreet(user);
        if (userStreet != null) {
            log.info(userStreet);
        } else {
            log.info("UNKNOWN");
        }
    }

    String getUserStreet(User user) {
        if (user == null) return null;
        if (user.getAddress() == null) return null;
        return user.getAddress().getStreet();
    }
}
