package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class DownStreamTest1 {

    @Test
    void test() {
        List<Student> students = List.of(
                Student.builder().name("Yong").grade(3).score(100).build(),
                Student.builder().name("Park").grade(1).score(70).build(),
                Student.builder().name("Lee").grade(2).score(70).build(),
                Student.builder().name("Han").grade(3).score(90).build(),
                Student.builder().name("Hoon").grade(1).score(90).build(),
                Student.builder().name("Ha").grade(2).score(89).build()
        );
        
        // 1단계: 학년별로 학생들을 그룹화
        Map<Integer, List<Student>> collect1_1 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade,  // 그룹화 기준: 학년
                Collectors.toList() // 다운스트림: 학생을 리스트로 수집
        ));
        log.info("collect1_1: {}", collect1_1);

        // 다운스트림에서 toList() 생략 가능
        Map<Integer, List<Student>> collect1_2 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade  // 그룹화 기준: 학년
        ));
        log.info("collect1_2: {}", collect1_2);

        // 2단계: 학년별로 학생들의 이름을 출력하라
        Map<Integer, List<String>> collect2 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade, // 그룹화 기준: 학년
                Collectors.mapping(Student::getName, // 다운스트림 1: 학생 -> 이름 변환
                        Collectors.toList() // 다운스트림 2: 변환된 값을 List로 수집
                )
        ));
        log.info("collect2: {}", collect2);

        // 3단계: 학년별로 학생들의 수를 출력하라.
        Map<Integer, Long> collect3 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.counting()
        ));
        log.info("collect3: {}", collect3);

        // 4단계: 학년별로 학생들의 평균 성적 출력하라.
        Map<Integer, Double> collect4 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.averagingInt(Student::getScore)
        ));
        log.info("collect4: {}", collect4);
    }
}
