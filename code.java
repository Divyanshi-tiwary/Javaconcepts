import java.io.*;
class Count{
int x=0;
static int y=0;
Count(){
x++;
y++;
System.out.println(x+y);
}
public static void main(String args[])
{
Count c1=new Count();
Count c2=new Count();
Count c3=new Count();
}
}
