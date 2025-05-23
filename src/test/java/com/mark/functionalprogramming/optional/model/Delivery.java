package com.mark.functionalprogramming.optional.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Delivery {

    private String status;
    private boolean canceled;
}
