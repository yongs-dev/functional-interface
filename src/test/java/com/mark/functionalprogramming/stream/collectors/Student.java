package com.mark.functionalprogramming.stream.collectors;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Student {

    private String name;
    private int grade;
    private int score;
}
