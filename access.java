 import java.io.*;
import java.util.Scanner;
class A
{
    void show()
    {
        System.out.println("Inside A's show method");
    }
}
  
class B extends A
{
    
    void show()
    {
        System.out.println("Inside B's show method");
    }
}
  
class C extends A
{
    
    void show()
    {
        System.out.println("Inside C's show method");
    }
}
  

class access
{
    public static void main(String args[])
    {
       
        A a = new A();
  
      
        B b = new B();
  

        C c = new C();
 
        A ref;
        ref = a;
        ref.show();
        ref = b;
        ref.show();
        ref = c;
        ref.show();
    }
}