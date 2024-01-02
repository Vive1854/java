
//program of Relationoper.java operatore 
import java.util.Scanner;
public class Relationoper {
    public static void main(String arge[]){
        int a, b,c;
        Scanner n=new Scanner(System.in);
        System.out.append("Enter the first number");
        a=n.nextInt();
        Scanner l=new Scanner(System.in);
        System.out.print("Enter the socend number");
        b=l.nextInt();
        Scanner f=new Scanner(System.in);
        System.out.print("Enter the therd number");
        c=f.nextInt();
       
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a<b is " + (a<b));
        System.out.println("a>b is " + (a>b));
        System.out.println("a==c is " + (a==c));
        System.out.println("a<=c is  " + (a<=c));
        System.out.println("a>=b is " + (a>=b));
        System.out.println("b !=c is " + (b!=c));
        System.out.print("b==a+c is " + (b==a+c)); 
    }

}
