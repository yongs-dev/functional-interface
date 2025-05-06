package com.mark.functionalprogramming.methodref;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class MethodRefEx2 {

    @Test
    void test() {
        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;
        log.info("staticMethod1: {}", staticMethod1.apply("Yong"));
        log.info("staticMethod2: {}", staticMethod2.apply("Yong"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Yong");
        Function<Integer, String> instanceMethod1 = number-> person.introduceWithNumber(number);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;
        log.info("instanceMethod1: {}", instanceMethod1.apply(1));
        log.info("instanceMethod2: {}", instanceMethod2.apply(2));

        // 3. 생성자 참조
        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;
        log.info("newPerson1: {}", newPerson1.apply("Yong"));
        log.info("newPerson2: {}", newPerson2.apply("Yong"));
    }
}
