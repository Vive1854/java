import java.util.Scanner;

public class Leap_not_leap {
    public static void main(String args[])
    {
      int n;
      Scanner r=new Scanner(System.in);
      System.out.print("Enter the year number");
      n=r.nextInt();
      if(n%100==0)
       if(n%400==0)
      {
         System.out.print("this year is leaper");
      }
      else
      {
        System.out.print("tis yers not leaper"); 
      }
     
      // {
      //   System.out.print("this year is leaper");
      // }else{
      //   System.out.print("tis yers not leaper");
      // }
    }
}
