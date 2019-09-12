import java.util.*;
class Vehicle
{
 String model;
 int year;
 String color;
 int vehicleno;
   void Vehicle()
  {vehicleno=0;
  	 year=0;
  	 color="";
  	 model="";
  }
  void vehicle(int vehicleno, int year, String color, String model)
 {
 this.vehicleno=vehicleno;
 this.year=year;
 this.color=color;
 this.model=model;
 }
 void output()
 {
 System.out.println("model=" +model +"year="+year + "color="+color + "vehicleno="+vehicleno);
 }
 }
 class DemoVehicle
 {
 public static void main(String args[])
 {
 int vehicleno, i;
 Scanner sc=new Scanner(System.in);
 Vehicle[] v1=new Vehicle[20];

 System.out.println("enter number of vehicles");
for(i=0; i<=no;i++)
{ 
System.out.println(" ENTER  MODEL, YEAR AND COLOR");
 String model=sc.next();
 int year=sc.nextInt();
 String color=sc.next();

v[i]= new Vechicle(vehicleno, year, color, value);

}  	
}
}
