 class Student{
    int id;
    String name;
    
}
/**
 * InnerObjecatandclass
 */
 class TestStudent2{
    public static void main(String []arge)
    {
       Student abc=new Student();
       Student abcd=new Student();
       abc.id=101;
       abc.name ="sumit"; 
       abcd.id=102;
       abcd.name="suman";
       System.out.println(abc.id+" "+abc.name);
       System.out.println(abcd.id+" "+abcd.name);
    }   
}
