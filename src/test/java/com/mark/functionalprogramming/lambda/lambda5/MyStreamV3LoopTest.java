package com.mark.functionalprogramming.lambda.lambda5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
public class MyStreamV3LoopTest {

    @Test
    public void test() {
        List<Student> students = List.of(
                Student.builder().name("Apple").score(100).build(),
                Student.builder().name("Banana").score(80).build(),
                Student.builder().name("Berry").score(50).build(),
                Student.builder().name("Tomato").score(40).build()
        );

        // 점수가 80점 이상인 학생의 이름을 추출
        List<String> result = MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();

        // 외부 반복
        for (String name : result) {
            log.info("name: {}", name);
        }

        // 내부 반복
        MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .forEach(name -> log.info("name: {}", name));
    }
}
