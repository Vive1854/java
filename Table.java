//program of table in java

import java.util.Scanner;
public class Table{
 public static void main(String args[])
   {
       Scanner r=new Scanner(System.in);
      System.out.print("Enter the number");
      int num=r.nextInt();
       for(int i=1; i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
       }
}
}

