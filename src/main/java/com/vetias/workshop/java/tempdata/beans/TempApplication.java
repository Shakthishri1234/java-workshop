package com.vetias.workshop.java.tempdata.beans;

import java.time.LocalDate;

public class TempApplication {

    // public static void main(String[] args) {

    //     Location location=new Location();
    //     System.out.println(location.toString());
        
    
 public static void main(String[] args) {
        
  Organization vet = new Organization (
    "Vetias",
     "thindal",
    "www.vetias.com",
     "VETIAS@gmail.com",
     24567,
     LocalDate.of(2023, 10, 1));
  System.out.println(vet);}
 }