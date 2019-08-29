import java.util.Scanner;
class AreaOfRectangle
{
 double rectangleArea(double length, double breadth)
{
double area;
area = length * breadth;
return area;
}

public static void main(String args[])
{
double length;
double breadth;
double area;

Scanner sc = new Scanner(System.in);

System.out.println("Enter length of rectangle");
length = sc.nextDouble();

System.out.println("Enter width of rectangle");
breadth = sc.nextDouble();

area = rectangleArea(length , breadth);
System.out.println("Area of rectangle is : "+area);
}
}


