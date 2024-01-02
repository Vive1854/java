
//program of lenss thne and grater then 
import java.util.Scanner;
public class Leesthen {
    public static void main(String args[])
    {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the first number");
        n=r.nextInt();
        if(n>=100)
        {
            System.out.print("number of graten then");
        }
        else{
            System.out.print("number is less then");
        }
    }
}
