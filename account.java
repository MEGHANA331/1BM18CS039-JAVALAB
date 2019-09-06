import java.util.*;

class Account
{
String name;
float balance;
int customer_number;
void account()
{
name = '\0';
customer number = 0;
balance = 0.0;
}
account (String name, float balance, int customer_number)
{
this.name = name;
this.balance = balance;
this.customer_number = customer_number;
}
void input1()
{
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the name");
name = Sc.next();
System.out.println("Enetr the balance");
balance = Sc.nextFloat();
System.out.println("Enter the customer number");
customer_number = Sc.nextInt();
}
void output1()
{
System.out.println("Name:" + name);
System.out.println("Balance:" + balance);
Sytem.out.println("Customer number:" + customer_number);
class savings_account extends account{
int intrest_rate;
int time_span;
}
int compute();
{
return balance*intrest_rate*time_span;
}
void input();
{
input1();
Scanner Sc = new Scanner(System.in);
System.out.println("Enetr the intrest rate");
intrest_rate = Sc.nextInt();
System.out.println("Enter the time span");
time_span = Sc.nextInt();
}
void output();
{
output1();
System.out.println("Rate:" + intrest_rate);
System.out.println("Time span:" + timpe_span);
System.out.println("Intrest:" + compute());
}
class Demo
{
public static void main(String args[])
{
savings_account obj = new savings_account();
obj.input();
obj.compute();
obj.output();
}
}

