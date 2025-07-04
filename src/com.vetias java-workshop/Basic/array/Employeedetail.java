import java.util.Arrays;

public class Employeedetail {
    public static void main(String[]args){
        String [][] employee= new String [5][2];
        employee[0][0]="12456";
        employee[0][1]="25,000";
        employee[1][0]="45760";
        employee[1][1]="35,000";
        employee[2][0]="35500";
        employee[2][1]="40,000";
        employee[3][0]="72311";
        employee[3][1]="50,000";
        employee[4][0]="50121";
        employee[4][1]="55,000";
    for (String[] employeedetails : employee){
  System.out.println(Arrays.toString(employeedetails));
    }
    }

}
