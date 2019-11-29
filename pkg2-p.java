package Databank;
import java.util.*;
public  abstract class Accounts
{
	public String acc_no,name, address ;
	Scanner sc=new Scanner(System.in);
	public double bal=0.0;
	public void input()
	{
		System.out.println("enter customer name,acc no,address=");
		name=sc.next();
		acc_no=sc.next();
		address=sc.next();
	}
	public void display()
	{
		System.out.println("Balance="+bal);
	}
	public void show()
	{
		System.out.println("account holder name="+name);
		System.out.println("account number="+acc_no);
		System.out.println("address="+address);
	}
	  public abstract void withdrawal();
	public abstract void deposit();
}


package savings;
import Databank.*;
import java.util.*;
public  class Savingsacc extends Accounts
{
	public double r,interest,with,deposit;
	public int t;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		super.input();
		System.out.println("enter the rate of interest and time");
		r=sc.nextDouble();
		t=sc.nextInt();
	}
		
	public void interestCal()
	{
		interest=bal*(Math.pow((1+(r*0.01)),t));
		bal=bal+interest;
	}
	public void display()
	{
		System.out.println("rate of Interest="+r);
		System.out.println("Interest="+interest);
		super.display();
	}
	public void withdrawal()
	{
		System.out.println("enter withdrawal account=");
		with=sc.nextDouble();
		bal=bal-with;
	}
	public void deposit()
	{
		System.out.println("enter deposit account=");
		deposit=sc.nextDouble();
		bal=bal+deposit;
	}
}



import Databank .*;
import savings .*;
class Employee
{
	public static void main(String args[])
	{
		Savingsacc s=new Savingsacc();
		s.input();
		s.deposit();
		s.withdrawal();
		s.interestCal();
		s.show();
		s.display();
	}
}
