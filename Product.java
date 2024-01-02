//find the product of given number
import java.util.Scanner;
public class Product{
    public static void main(String []args)
    {
        int n,pro=1;
        Scanner R=new Scanner(System.in);
        System.out.print("Enter the product");
        n=R.nextInt();
        while (n>0) {
            pro=pro*n/10;
            n=n/10;
            
        }
        System.out.println("product of diget="+pro);
    }
}
