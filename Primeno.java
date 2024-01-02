//prime  and note prime numbe
import java.util.Scanner;
public class Primeno {
    public static void main(String[]arge)
    {
        int n,count=0,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        n=sc.nextInt();
        // i=1;
        while (i<=n) {
            if(n/i==0){
               count=count++;
                i=i++;
            }    
        if (count==2) {
            System.out.print("this is a prime no");
        } else {
            
            System.out.print("this is not prime ");
        }
    
    }
}
}
