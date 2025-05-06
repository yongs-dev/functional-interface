package com.mark.functionalprogramming.methodref;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

@Slf4j
public class MethodRefEx3 {

    @Test
    void test() {
        // 4. 임의 객체의 인스턴스 메서드 참조(특정 타입의)
        Person person1 = new Person("Yong");
        Person person2 = new Person("Kim");
        Person person3 = new Person("Park");

        // 람다
        Function<Person, String> func1 = person -> person.introduce();
        log.info("person1.introduce: {}", func1.apply(person1));
        log.info("person2.introduce: {}", func1.apply(person2));
        log.info("person3.introduce: {}", func1.apply(person3));

        // 메서드 참조, 타입이 첫 번째 매개변수가 됨, 그리고 첫 번째 매개변수의 메서드를 호출, 나머지는 순서대로 매개변수에 전달
        Function<Person, String> func2 = Person::introduce;
        log.info("person2.introduce: {}", func2.apply(person2));
        log.info("person1.introduce: {}", func2.apply(person1));
        log.info("person3.introduce: {}", func2.apply(person3));
    }
}
