
//program of conster date 15-10-2023
class Const{
           int a; String name;
      Const()
    {
      a=0; name=null;
    }
     void show ()
      {
     System.out.print(a+ " " +name);
       
     }         
}
class Dect{
 public static void main(String[] args){
     Const ref=new Const();
     ref.show();
}
}