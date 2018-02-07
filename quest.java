import java.io.*;
class ss
{
public static void main(String aa[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of characters of string");
int n=Integer.parseInt(br.readLine());
String s;
System.out.println("Enter a string");
s=br.readLine();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.charAt(i);
}
System.out.println(a[0]);
}}