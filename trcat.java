class trcat
{
public static void main(String aa[])
{
int a=5,b=0;
int c=0;
try
{
c=a/b;
System.out.println(c);
}
finally
{
	System.out.println("It always executes");
	System.out.println(c);	
}
}}