package com.mark.functionalprogramming.optional.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

    private Long id;
    private Delivery delivery;
}
