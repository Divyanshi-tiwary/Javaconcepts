import java.util.*;
class Demo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+x*x+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the triangle is "+0.5*x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class OverloadArea 
{
     public static void main(String args[]) 
	{
	   Demo shape = new Demo();
	   shape.area(6);
	   shape.area(14,12);
	   shape.area(2.6);
        }
}