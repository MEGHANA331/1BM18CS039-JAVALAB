import java.util.*;

class rectangle
{
 private int l,b;
 rectangle();
{
 l=0;
 b=0;
}
rectangle(int l,int b);
{
this.l=l;
this.b=b;
}
 int area();
{
 return l*b;
}
}
class dimension extends rectangle
{
 int h;
 dimension();
{
 super();
 h=0;
}
}
class int dimension(int l,int b,int h)
{
super(l,b);
this.h=h;
}
int volume();
{
return area()*h;
}
class demo
{
public static void main(string args[])
{
dimension ob=new dimension(1,2,3);
System.out.println(ob.area());
System.out.println(ob.volume());
}
}
}
}
