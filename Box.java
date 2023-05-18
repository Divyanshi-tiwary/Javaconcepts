import java.util.*;
class Box 
{
      
   public static void main(String args[]) 
    {   
       
        	Scanner s= new Scanner(System.in);
         	System.out.println("Enter the length of box:");
         	double l=s.nextDouble();
		System.out.println("Enter the breadth of box:");
         	double b=s.nextDouble();
		System.out.println("Enter height of box:");
         	double h=s.nextDouble();
                
                 double  volume= l*b*h;
 
             System.out.println("Volume Of box is:" +volume);
             
          
   }
}