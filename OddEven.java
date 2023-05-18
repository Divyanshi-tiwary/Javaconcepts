import java.io.*;

class OddEven{

public static void main(String args []){

int a[]=new int [10];

System.out.println("Enter the 10 elements: ");

for (int i=0;i<args.length;i++) 
{

a[i]=Integer.parseInt(args [i]);

}

int even=0, odd=0;

for (int i=0;i<10; i++){

if (a[i]%2==0){

System.out.print(a[i]);

System.out.print(" ");

even++;
}

else if (a[i]%2!=0){

System.out.print(a[i]);

System.out.print(" ");

odd++;

}

}

System.out.println("Total no.of even numbers: "+even);

System.out.println("Total no.of odd numbers:"+odd);
}
}