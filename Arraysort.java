import.java.util;
class Arraysort
{
public static void main(String args[])
{
int n, i, j, temp;
int arr[] = new int[50];
Scanner scan = new Scanner(System.in);
System.out.println("enter the array elements:");
n = scan.nextInt();
System.out.println("enter " +n+" numbers:");
for(i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}
System.out.println("Sorting array:");
for(i=0;i<(n-1);i++)
{
for(j=0;j<(n-i-1);j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("array sorted successfully...!!!");
System.out.println("sorted array list in ascending order:");
for(i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
}
}