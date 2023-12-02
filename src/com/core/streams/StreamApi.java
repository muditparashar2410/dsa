package com.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

    List<Integer> list  = Arrays.asList(2, 4, 50);

        List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);


    }
}
