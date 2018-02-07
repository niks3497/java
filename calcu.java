import packa.fun;
import java.io.*;
public class calcu
{
public static void main(String args[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int x;
fun obj1=new fun();
System.out.println("Enter the value of x:");
x=Integer.parseInt(br.readLine());
System.out.println("Square of x="+obj1.squa(x));
System.out.println("Cube of x="+obj1.cube(x));
}}
