package com.mark.functionalprogramming.stream.collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class DownStreamTest2 {

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

        // 1단계: 학년별로 학생들을 그룹화하라
        Map<Integer, List<Student>> collect1 = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        log.info("collect1: {}", collect1);
        
        // 2단계: 학년별로 가장 점수가 높은 학생을 구해라. reducing 사용
        Map<Integer, Optional<Student>> collect2 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.reducing((s1, s2) -> s1.getScore() > s2.getScore() ? s1 : s2)
        ));
        log.info("collect2: {}", collect2);
        
        // 3단계: 학년별로 가장 점수가 높은 학생을 구해라. maxBy 사용
        Map<Integer, Optional<Student>> collect3 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.maxBy(Comparator.comparingInt(Student::getScore))
//                Collectors.maxBy((s1, s2) -> s1.getScore() > s2.getScore() ? 1 : -1)
        ));
        log.info("collect3: {}", collect3);
        
        // 4단계: 학년별로 가장 점수가 높은 학생의 이름을 구해라. collectingAndThen + maxBy 사용
        // 학년별 그룹 -> 그룺별 가장 점수가 높은 학생 -> 그룹별 최고점 학생 -> 그룹별 최고점 학생의 이름
        Map<Integer, String> collect4 = students.stream().collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(Student::getScore)),
                        sOpt -> sOpt.get().getName()
                )
        ));
        log.info("collect4: {}", collect4);
    }
}
