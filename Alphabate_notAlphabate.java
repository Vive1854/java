import java.util.Scanner;

public class Alphabate_notAlphabate {
    public static void main(String args[])
    {
        char ch;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the chactor ");
        ch=r.next().charAt(0);
        if(ch> 'a'&& ch<= 'z'){
            System.out.print("this a number ");
        }else{
            System.out.print(" is charoctor");
        }

    }
}
