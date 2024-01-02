public class NonPrimitive{
   public static void main(String[] args){
    String str = "vivek";
    System.out.println("String is: " + str);

    String str1 = new String("vivek");
    System.out.println("Another string: " +  str1);

    int arr[];
    arr = new int [2];
    arr[0] = 2;
    arr[1] = 4;
    arr[2] = 2;
    System.out.println(arr);
    System.out.println(arr[0]);
   }
    
}
