import java.util.Scanner;

public class Factorial {
    public static void main (String vivek[])
    {
        int n,i=1,f=1 ;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the Factoral number");
        n=r.nextInt();
        while (i<=n) {
            f=f*n;
            n--;

        }
       System.out.print("this is a factorial " + f);
    }
    
}
