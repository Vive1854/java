public class Tertnumber {
    public static void main(String []args)

    {
        int num,valid=0,invalid=0;
        for(int i=0; i<=args.length;i++);
        {
            try{
                num=Integer.parseInt (args[i]);
            }
            catch( NumberFormatException  i)
            {

                invalid++;
                System.out.print("Invalid argument is =" + args[i]);
                continue;
            }
            valid++;
        }
        System.out.print("Totel valid argument arg=" + valid);
        System.out.print("Total invaid Argument =" + invalid);

    }
 }
