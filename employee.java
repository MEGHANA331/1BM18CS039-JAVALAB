import java.util.*;

class employee

{

int empno;

String empname;

double da,it,netsalary;

double basic;

double grosssalary;

void read()

{

System.out.println("enter employee id, employee name and value of basic");

Scanner sc = new Scanner(System.in);



empno = sc.nextInt();

empname=sc.next();

basic=sc.nextDouble();

grosssalary=sc.nextDouble();



}

void calc()

{

da=(75/100)*basic;

it=(30/100)*grosssalary;

netsalary=basic+da-it;

}

void output()

{

System.out.println("id:"+empno);

System.out.println("name:"+empname);

System.out.println("net salary:"+netsalary);

}

}

class employee1

{

public static void main(String args[])

{

employee e1= new employee();

employee e2= new employee();

e1.read();

e1.calc();

System.out.println("employee 1 details:");

e1.output();

e2.read();

e2.calc();

System.out.println("employee 2 details:");

e2.output();

}

}