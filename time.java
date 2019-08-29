
import java.util.Scanner;
class time
{
int hrs,mins,secs;
time()
{
hrs=0;
mins=0;
secs=0;
}
time(int h,int m,int s)
{
hrs=h;
mins=m;
secs=s;
}
void advanced(int a,int b,int c)
{
secs=secs+(c/60);
mins=mins+(b/60);
hrs=hrs+(a/60);
}
void currenttime(int h1,int m1,int s1)
{
hrs=h1;
mins=m1;
secs=s1;
}
void print()
{
System.out.println("time="+hrs+" "+mins+" "+secs);
}
}
class time
{
public static void main(String args[])
{
System.out.println("enter h1,m1,s1");
Scanner sc= new Scanner(System.in);
int h1 = sc.nextInt();
int m1 = sc.nextInt();
int s1 = sc.nextInt();
time t = new time(h1,m1,s1);
System.out.println("enter time u want to advance");
int ah = sc.nextInt();
int am = sc.nextInt();
int as = sc.nextInt();
t.advanced(ah,am,as);
System.out.println("enter current time");
int h1 = sc.nextInt();
int m1 = sc.nextInt();
int s1 = sc.nextInt();
t1.currenttime(h1,m1,s1);
t1.print();
}
}



