import java.util.Scanner;

public class IncermentDEcrmint {
    public static void main(String Args[])
    {
        int a,b;
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the first number ");
        a=n.nextInt();
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the second number");
        b=r.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("++a = " + ++a);
        System.out.println("b++ = " + b++);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
