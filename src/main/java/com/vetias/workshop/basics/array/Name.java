package com.vetias.workshop.basics.array;

public class Name {

    public static void main(String[] args) {
        String text="the java program";
        String []sentence=text.split("\\.");
        String[]words=text.split("");
        System.out.println(sentence.length);
        System.out.println(words.length);
        System.out.println(text.length());
    }
}
