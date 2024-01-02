class Animal{  
void eat(){System.out.println("elephent ");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("cat.");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  