import java.util.*;
public class Calculate {
double length;
double width;
 

    void Area()
    {
        double area;
        area = this.length * this.width;
System.out.println("Area of rectangle is : "
                           + area);
    }
 
   
    void Perimeter()
    {
        double perimeter;
        perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of rectangle is : "
                           + perimeter);
}
}
 
 class Display {
    
    public static void main(String args[])
    {
   
        Calculate rec = new Calculate();

        rec.length = 17.8;

        rec.width = 24.87;
 
        System.out.println("Length = " + rec.length);
        System.out.println("Width = " + rec.width);
        rec.Area();

        rec.Perimeter();
    }
}