import java.util.Scanner;
public class Voting {
    public static void main(String args[])
    {
        int age;
        Scanner n=new Scanner(System.in);
        System.out.print("Enter your age");
        age=n.nextInt();
        if(age>=18)
        {
            System.out.print("you are agble vote");
        }else{
            System.out.print("you are not aglble vode");
        }
    }
}
