package com.vetias.workshop.streams;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {50, 60, 70, 80, 90, 100};
        long numbersubject = java.util.Arrays.stream(marks)
                .filter(mark -> mark > 60)
                .count();
        System.out.println(numbersubject);

        java.util.stream.IntStream markstream = java.util.Arrays.stream(marks);
        long numbersubjectpassed = markstream
                .filter(mark -> mark > 60)
                .count();
        System.out.println(numbersubjectpassed);
    }

}
