package com.mark.functionalprogramming.lambda.lambda5;

import com.mark.functionalprogramming.lambda.ex2.MyPredicate;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
public class MyStreamV1 {

    private List<Integer> internalList;

    public MyStreamV1 filter(MyPredicate predicate) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer element : internalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }

        return new MyStreamV1(filtered);
    }

    public MyStreamV1 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();

        for (Integer element : internalList) {
            mapped.add(mapper.apply(element));
        }

        return new MyStreamV1(mapped);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
