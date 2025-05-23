package com.mark.functionalprogramming.optional;

import com.mark.functionalprogramming.optional.model.Address;
import com.mark.functionalprogramming.optional.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@Slf4j
public class AddressTest2 {

    @Test
    void test() {
        User user1 = new User("user1", null);
        User user2 = new User("user2", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                log::info,
                () -> log.info("UNKNOWN")
        );
    }

    Optional<String> getUserStreet(User user) {
        // map 체이닝 중간에 null이면 Optional.empty() 반환
        return Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getStreet);
    }
}
