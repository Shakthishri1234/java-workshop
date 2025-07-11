package com.vetias.workshop.java.tempdata.beans;

import java.util.*;

public class temperaturedata {

    public static void main(String[] args) {
     Temperaturesensor value = new Temperaturesensor(35.1f);
     System.out.println(value.getReading());
    }
}
