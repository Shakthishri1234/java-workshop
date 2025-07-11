package com.vetias.workshop.building.Hostel;

import com.vetias.workshop.java.tempdata.beans.Building;

public class Hostelbuilding extends Building{
    private boolean ismessavailable;
    private int isroomavailable;
public boolean ismessavailable() {
    return ismessavailable;
}
public int isroomavailable() {
    return isroomavailable;
}
public void printdetails() {
    super.printdetails();
    System.out.println("mess available:" + ismessavailable);
    System.out.println("room available:" + isroomavailable);
}
}
