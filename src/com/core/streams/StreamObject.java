package com.core.streams;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
//        Stream API
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::print);
    }
}
