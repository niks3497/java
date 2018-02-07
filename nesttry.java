import java.io.*;
class nesttry
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int a,b;
System.out.println("enter a");
a=Integer.parseInt(in.readLine());
System.out.println("enter b");
b=Integer.parseInt(in.readLine());
int c=0;int p=1,q=0,w=0;
try
{
try
{	
w=p/q;
}
catch(Exception e)
{
System.out.println(e);
}
try
{
c=a/b;
}
catch(Exception e)
{
System.out.println(e);
}
}
catch(Exception f)
{
System.out.println(f);
}}}
