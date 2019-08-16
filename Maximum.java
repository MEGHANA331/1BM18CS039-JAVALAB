import java.util.*;

class Maximum 
{

    public static void main(String[] args) 
{

    Scanner input= new Scanner(System.in);

    System.out.println("Please enter 10 integers");

    int array[][]= new int[2][5];

        
    for(int i=0; i<array.length; i++)
{

    int max= array[i][0];
    for(int j=0; j<array[i].length; j++)
{

    array[i][j]= input.nextInt();

    if(max<array[i][j])
{

    max= array[i][j];
}
}
    System.out.println("Maximum number is "+ max);
    System.out.println();
}              

}

}