package com.mark.functionalprogramming.methodref;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Slf4j
public class MethodRefEx4 {

    @Test
    void test() {
        List<Person> personList = List.of(
                new Person("Yong"),
                new Person("Kim"),
                new Person("Park")
        );

        List<String> result1 = mapPersonToString(personList, s -> s.introduce());
        log.info("result1: {}", result1);

        List<String> result2 = mapPersonToString(personList, Person::introduce);
        log.info("result2: {}", result2);

        List<String> upperResult1 = mapStringToString(result1, s -> s.toUpperCase());
        log.info("upperResult1: {}", upperResult1);

        List<String> upperResult2 = mapStringToString(result2, String::toUpperCase);
        log.info("upperResult2: {}", upperResult2);
    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> func) {
        List<String> result = new ArrayList<>();
        
        for (Person person : personList) {
            result.add(func.apply(person));
        }
        
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> func) {
        List<String> result = new ArrayList<>();

        for (String string : strings) {
            result.add(func.apply(string));
        }

        return result;
    }
}
