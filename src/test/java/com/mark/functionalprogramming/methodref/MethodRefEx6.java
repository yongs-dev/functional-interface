package com.mark.functionalprogramming.methodref;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

@Slf4j
public class MethodRefEx6 {

    @Test
    void test() {
        // 4. 임의 객체의 인스턴스 메서드 참조 (특정 타입의)
        Person person = new Person("Yong");

        // 람다
        BiFunction<Person, Integer, String> func1 = (Person p, Integer number) -> p.introduceWithNumber(number);
        log.info("result1: {}", func1.apply(person, 1));
        
        // 매서드 참조, 타입이 첫 번째 매개변수가 됨. 그리고 첫 번째 매개변수의 메서드를 호출
        BiFunction<Person, Integer, String> func2 = Person::introduceWithNumber;
        log.info("result2: {}", func2.apply(person, 1));
    }
}
