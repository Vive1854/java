//sum of Natural number 
import java.util.Scanner;
public class Sumn {
   public static void main(String[] args)
   int n,sum=0;
       System.out.print("Enter no of term");
       Scanner r=new Scanner(System.in);
     n=r.nextInt();
      for(int i= 1;i<=n;i++)
           { 
                sum=sum+i;
           }
         System.out.print("Addition of neturl no" + sum);
}