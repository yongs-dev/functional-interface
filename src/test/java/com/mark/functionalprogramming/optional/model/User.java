package com.mark.functionalprogramming.optional.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String name;
    private Address address;
}
