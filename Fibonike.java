import java.util.Scanner;
public class Fibonike {
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int x=0,y=1,z=0,n;
    System.out.print("Enter the max  number");
    n=sc.nextInt();
    while (z<=n) {
        System.out.println(z);
        x=y;
        y=z;
        z=x+y;  
    }
    }
}
