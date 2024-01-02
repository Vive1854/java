import java.util.Scanner;
public class Array {
public static void main(String[]args)
{
    int a[]=new int[10];
    int i;
    Scanner R=new Scanner(System.in);
    for( i=0;i<10;i++)
    {
        System.out.print("Enter the Array Value");
        a[i]=R.nextInt();
        for( i=0;i<10;i++)
     {
        System.out.println(a[i]);
     }
    }   
}
}       


