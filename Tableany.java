import java.util.Scanner;
public class Tableany {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j=1;
        System.out.print("Enter number at print table");
        i=sc.nextInt();
        while (j<=10) { 
            System.out.println(i*j);
             j=j+1;
        }
    }
    
}
