package com.vetias.workshop.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        List<String> name =new ArrayList<>();
        name.add("shakthi");
        name.add("jemc");
        name.add("nasreen");
        name.set(1,"anu");
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
        }
    }

}
