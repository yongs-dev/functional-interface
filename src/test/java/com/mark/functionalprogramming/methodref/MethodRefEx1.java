package com.mark.functionalprogramming.methodref;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

@Slf4j
public class MethodRefEx1 {

    @Test
    void test() {
        // 1. 정적 메서드 참조
        Supplier<String> staticMethod1 = () -> Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting;
        log.info("staticMethod1: {}", staticMethod1.get());
        log.info("staticMethod2: {}", staticMethod2.get());

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Yong");
        Supplier<String> instanceMethod1 = () -> person.introduce();
        Supplier<String> instanceMethod2 = person::introduce;
        log.info("instanceMethod1: {}", instanceMethod1.get());
        log.info("instanceMethod2: {}", instanceMethod2.get());

        // 3. 생성자 참조
        Supplier<Person> newPerson1 = () -> new Person();
        Supplier<Person> newPerson2 = Person::new;
        log.info("newPerson1: {}", newPerson1.get());
        log.info("newPerson2: {}", newPerson2.get());
    }
}
