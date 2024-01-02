import java.util.*;
class demons
{
public static void main(String [ ]args)
{
int len,br,area,peri;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length");
len=sc.nextInt();
System.out.println("Enetr the Breadth");
br=sc.nextInt();
area=len*br;
peri=2*(len+br);

System.out.println("Area of length=" + area);
System.out.println("Perimeter of Rectangel=" + peri);
}
}