package com.mark.functionalprogramming.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ImmutablePerson {

    private final String name;
    private final int age;

    // 변경이 필요한 경우, 기존 객체를 수정하지 않고 새 객체를 반환
    public ImmutablePerson withAge(int age) {
        return new ImmutablePerson(name, age);
    }
}
