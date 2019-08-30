import java.util.*;
class Books{

String name;
String author;
float price;
int num_pages;

Books(String name, String author, float price, int num_pages)

{

this.name = name;
this.author = author;
this.price = price;
this.num_pages = num_pages;

}

class Details{
public static void main(String args[])

{

int i;
int n;
String s = "Name of the book:" + name +, "Author of the book:" + author +, "Price of the book:" + price +, "Pages in the book:" + num_pages;
Scanner sc = new Scanner(System.in);
System.out.println("Scanner String: " + sc.nextLine());
System.out.println("String representation" + " of this Scanner: + sc.toString());

Books arr[] = new Books[n];

for(int i=0; i<n; i++)

{

arr[i] = new Books();

}
}
}
}
