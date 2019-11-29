package CIE;
import java.util.*;
public class Student
{
	Scanner sc=new Scanner(System.in);
	String usn,name;
	int sem;
	public void get()
	{
		System.out.println("enter usn,name and sem");
		usn=sc.next();
		name=sc.next();
		sem=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("USN="+usn);
		System.out.println("Name:"+name);
		System.out.println("sem="+sem);
	}
}


package CIE;
import java.util.*;

public class Internals extends Student
{
	Scanner sc=new Scanner(System.in);
	public int m[]=new int[5];
	public void get()
	{
		super.get();
		System.out.println("enter cie marks of 5 subjects out of 50");
		for(int i=0;i<5;i++)
			m[i]=sc.nextInt();
	}
	public void disp()
	{
		super.disp();
		System.out.println("cie marks in each subject are");
		for(int i=0;i<5;i++)
		{
			System.out.println(m[i]);
		
		}
	}
}


package SEE;
import CIE.*;
import java.util.*;
public class External extends Student
{
	Scanner sc=new Scanner(System.in);
	public int sm[]=new int[5];
	public void get()
	{
		
		System.out.println("enter see marks of 5 subjects out of 50");
		for(int i=0;i<5;i++)
			sm[i]=sc.nextInt();
	}
	public void disp()
	{
		
		System.out.println("see marks in each subject are");
		for(int i=0;i<5;i++)
		{
			System.out.println(sm[i]);
		
		}
	}
}


import java.util.*;
import CIE.*;
import SEE.*;
class Final
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of students");
		int n=sc.nextInt();
		External e[]=new External[n];
		Internals in[]=new Internals[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Student"+(i+1));
			e[i]=new External();
			in[i]=new Internals();
			in[i].get();
			e[i].get();
			int f[]=new int[5];
			for(int j=0;j<5;j++)
			{
				f[j]=e[i].sm[j]+in[i].m[j];
			}
			in[i].disp();
			e[i].disp();
			System.out.println("Final marks out of 100 are");
			for(int j=0;j<5;j++)
			{
				System.out.println(f[j]);
			}
		}
	}
}
			
		
		
