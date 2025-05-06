package com.mark.functionalprogramming.lambda.lambda5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class MyStreamV3Test {

    @Test
    public void test() {
        List<Student> students = List.of(
                Student.builder().name("Apple").score(100).build(),
                Student.builder().name("Banana").score(80).build(),
                Student.builder().name("Berry").score(50).build(),
                Student.builder().name("Tomato").score(40).build()
        );

        // 점수가 80점 이상인 학생의 이름을 추출
        List<String> result1 = ex1(students);
        log.info("result1: {}", result1);

        // 점수아 80점 이상이면서, 이름이 5글자인 학생의 이름을 대문자로 추출해라.
        List<String> result2 = ex2(students);
        log.info("result2: {}", result2);
    }

    private List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

    private List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 5)
                .map(s -> s.getName())
                .map(s -> s.toUpperCase())
                .toList();
    }
}
