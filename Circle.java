import java.util.Scanner;
class Circle{
public static void main(String[] args){

    final double PI=3.14,area;
    int r;
    System.out.print("Enter the radius volue");
    Scanner ref = new Scanner(System.in);
    r=ref.nextInt();

   area=PI*r*r;
   System.out.print("Area of circle"+area);
   
  }
}