class Palindrome{  
 public static void main(String args[]){  
  int t,sum=0,temp;    
  int n=454; 
  
  temp=n;    
  while(n>0){    
   t=n%10;   
   sum=(sum*10)+t;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  