package com.mark.functionalprogramming.lambda.lambda5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Ex2_StudentTest {

    @Test
    public void test() {
        // 점수가 80점 이상인 학생의 이름을 추출해라
        List<Student> students = List.of(
                Student.builder().name("Apple").score(100).build(),
                Student.builder().name("Banana").score(80).build(),
                Student.builder().name("Berry").score(50).build(),
                Student.builder().name("Tomato").score(40).build()
        );

        List<String> directResult = direct(students);
        log.info("directResult: {}", directResult);

        List<String> lambdaResult = lambda(students);
        log.info("lambdaResult: {}", lambdaResult);
    }

    private List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();

        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }

        return result;
    }

    private List<String> lambda(List<Student> students) {
        return students.stream()
                .filter(s -> s.getScore() >= 80)
                .map(Student::getName)
                .toList();
    }
}
