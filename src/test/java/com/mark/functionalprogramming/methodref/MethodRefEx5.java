package com.mark.functionalprogramming.methodref;

import com.mark.functionalprogramming.lambda.lambda5.MyStreamV3;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class MethodRefEx5 {

    @Test
    void test() {
        List<Person> personList = List.of(
                new Person("Yong"),
                new Person("Kim"),
                new Person("Park")
        );

        MyStreamV3<String> result1 = MyStreamV3.of(personList)
                .map(person -> person.introduce())
                .map(str -> str.toUpperCase());

        log.info("result1: {}", result1);

        MyStreamV3<String> result2 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase);

        log.info("result2: {}", result2);
    }
}
