package com.mark.functionalprogramming.lambda.lambda5;

import com.mark.functionalprogramming.lambda.ex2.MyPredicate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MyStreamV2 {

    private List<Integer> internalList;

    // static factory 추가
    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }

    public MyStreamV2 filter(MyPredicate predicate) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer element : internalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }

        return MyStreamV2.of(filtered);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();

        for (Integer element : internalList) {
            mapped.add(mapper.apply(element));
        }

        return MyStreamV2.of(mapped);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
