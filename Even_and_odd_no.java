import java.util.Scanner;

public class Even_and_odd_no {
    public static void main(String args[])
    {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number");
        n=r.nextInt();
        if(n%2==0){
            System.out.print("this is a Even number");
        }else{
            System.out.print("This is Odd number");
        }
    }
} 
