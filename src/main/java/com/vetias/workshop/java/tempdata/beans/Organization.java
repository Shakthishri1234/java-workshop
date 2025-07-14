package com.vetias.workshop.java.tempdata.beans;
import java.time.LocalDate;

public record Organization(String name,
    String address,
    String website,
    String emailaddress,
    long registrationnumber,
    LocalDate registrationdate) {
        

}
