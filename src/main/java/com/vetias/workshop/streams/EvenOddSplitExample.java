package com.vetias.workshop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSplitExample {
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean,List<Integer>> groupedmap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
                System.out.println("Even numbers: " + groupedmap.get(true));
                System.out.println("Odd numbers: " + groupedmap.get(false));
    }

}
