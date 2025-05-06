package com.mark.functionalprogramming.lambda.lambda5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MyStreamV3<T> {

    private List<T> internalList;

    // static factory 추가
    public static <T> MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3<>(internalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();

        for (T element : internalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }

        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();

        for (T element : internalList) {
            mapped.add(mapper.apply(element));
        }

        return MyStreamV3.of(mapped);
    }

    public List<T> toList() {
        return internalList;
    }

    public void forEach(Consumer<T> consumer) {
        for (T element : internalList) {
            consumer.accept(element);
        }
    }

    public T getFirst() {
        return internalList.get(0);
    }
}
