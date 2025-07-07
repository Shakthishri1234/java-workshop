package tempdata.beans;

public class Location {
    private double latitude;
    private String name;
    private double longtitude;
    private String description;
    private String address;
    private String country;
    private String city;
     public void setname(String aName){
        name=aName;
     }
     public String getname () {
        return name;

     }
     public void setlatitude(double alatitude){
       latitude=alatitude;
     }
       public double getlatitude(){
         return latitude;
       }
       public void setlongtitude(double alongtitude){
         longtitude = alongtitude;
       }
      public double getlongtitute(){
         return longtitude;
     }
     public void setaddress(String aaddress){
         address = aaddress;
       }
      public String getaddress(){
         return address;
     }
     public void setcity(String acity){
         city = acity;
       }
      public String getcity(){
         return city ; 
     }
     public void setcountry(String acountry){
         country=acountry;
       }
      public String getcountry(){
         return country ; 
     }
     public void setdescription(String adescription){
         country=adescription;
       }
      public String getdescription(){
         return description; 
     }
     public String toString(){
      return "Location {name:"+ name+
              ",Latitude : "+ latitude +
              ",Longtitude : "+ longtitude +
              ",address : "+ address +
              ",description : "+ description +
              ",country : "+ country +
              ",city : "+ city +"}";

     }

   }



