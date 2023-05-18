import java.util.*;
class Subtract{  
static int sub(int a, int b)
{
return a-b;
}  
static double sub(double a, double b)
{
return a-b;}  
}  
class SubtractOverloading
{  
public static void main(String[] args)
{  
System.out.println(Subtract.sub(11,11));  
System.out.println(Subtract.sub(12.3,12.6));  
}
}  