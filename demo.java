import java.io.*;
class demo
{
public static void main(String arg[] )throws IOException
{
String s="Hello world";ja
FileWriter fw=new FileWriter ("abc.txt");
for(int i=0;i<s.length();i++)
{
fw.write(s.charAt(i));
}
fw.close();
}
}