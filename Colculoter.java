
/**
 *program of  Colculoter
 */
import java.util.Scanner;
public class Colculoter {
    public static void main(String args[]){
        int n,m,add;
        char cho;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the fairst number");
        n=r.nextInt();
        Scanner v=new Scanner(System.in);  
        System.out.print(" Enter the  Second number");
        m=v.nextInt();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter you operator '+','-','*','/','%' ");
        cho=s.  next().charAt(0);
       switch (cho) {
        case '+':
        add= n+m; 
          System.out.append("Addtion your number " + (n+m));
            break;
        case '-':
         add = n-m;
          System.out.append("sub your number "+ (n-m));
            break;
        case '*':
          add = n*m;
          System.out.append("mul your number" + (n*m));
            break;
        case '/':
        add = n/m;
          System.out.append("div your number "+ (n/m));
            break;
        case '%':
        add = n%m;
          System.out.append(" your number "+ (n%m));
            break;
        default:
           System.out.print("not Ablabel your opertor");
       }
    }
    
}