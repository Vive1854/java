import java.util.Scanner;
class Factorl
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n,fac=1;
System.out.println("Enter the number");
n=sc.nextInt();
while(n>0){
fac=fac*n;
n=n-1;
}
System.out.print("factrol number="+fac);
}
}

