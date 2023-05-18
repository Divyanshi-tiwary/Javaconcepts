import java.util.*;  
import java.util.Arrays; 

public class ElementOccurence 
{  
   public static void main(String args[])   
   {  
       Scanner sc=new Scanner(System.in);

      int n;  
      System.out.println("Enter the total number of elements ");
      n=sc.nextInt();  

      int arr[]=new int[n];  
      System.out.println("Enter the elements of the array ");
      for(int i=0; i<n ;i++)     
      {
          arr[i]=sc.nextInt();
      }
      
        System.out.println("Enter the element to know its occrence");
        int element=sc.nextInt();
        int occurence=0;
        
        for(int i=0;i<n;i++)
        {
            if(element==arr[i])
            {
                occurence++; 
            }
        }
        System.out.println(element+" occurred "+occurence+" times ");
        
       
   }
}
