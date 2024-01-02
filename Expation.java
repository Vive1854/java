public class Expation {
    public static void main(String[]arg)
    int  a=20,b=10;
    try {
        int x=a/(b-10);
        System.out.print("x"+x);
    }
    catch(ArithmeticException i)
    {
        System.out.print("Number is divided by zero");

    }
    int y=a/(a+10);
    System.out.println("y"+ y);

}
