import java.util.Scanner;

class For
{
    
    public static void main(String args[])
    {
        int x,y,sum;
        Scanner s=new Scanner(System.in);
        System.out.println("enter first");
        x=s.nextInt();
        System.out.println("enter secound no");
        y=s.nextInt();
        sum=x+y;
        System.out.print("sum is :"+sum);
    }
}