import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the name");
     String name=sc.nextLine();
     System.out.println("name : "  + name);
     System.out.println("enter the gender");
     String gender=sc.nextLine();
     System.out.println("gender :" + gender);
     System.out.println("enter the qualification");
     String qualification=sc.nextLine();
     System.out.println("qualification: "+ qualification);
     if("male".equalsIgnoreCase(gender)) {
        System.out.println("mr");
    }
    else if("female".equalsIgnoreCase(gender)){
        System.out.println("miss");
    }
    else
    {
        System.out.println("hello");
    
    }
  }
}
