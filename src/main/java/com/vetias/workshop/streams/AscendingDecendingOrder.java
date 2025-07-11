package com.vetias.workshop.streams;

import java.util.Arrays;
import java.util.Collections;

public class AscendingDecendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 7, 4, 6};
        System.out.println("Ascending Order:");
        Arrays.stream(numbers)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("Descending Order:");
        Arrays.stream(numbers)
                .boxed() 
                .sorted(Collections.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        
    }

}
