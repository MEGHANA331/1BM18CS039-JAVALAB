import java.util.*;
abstract int class Dimension{
protected int l,b;
protected float area;
void getdata(){
Scanner Sc = new Scanner(System.in);
Sytem.out.println("Enter l,b:");
l = sc.nextInt();
b = Sc.nextInt();
}
void display(){
System.out.println("Area:" + area);
abstract float calculation area();
}
}
class Triangle extends Dimension{
float calculation area(){
area = 0.5*l*b;
return area ;
}
}
class Rectangle extends Dimension{
float calculation area(){
area = l*b;
return area;
}
}
class Demo{
public static void main(String args[]){
int choice;
System.out.println("Enter the choice 0:Triangle 1:Rectangle");
Scanner Sc = new Scanner(System.in);
int ch = sc.nexrInt;
Dimension ref;
if(choice==0){
ref = new Rectangle();
else 
if(choice==1){
ref = new Triangle();
}
}
area = ref.calculation area();
ref.display();
}
}
