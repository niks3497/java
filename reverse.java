class reverse
{
public static void main(String args[])
{
int n=248;String a="";
String s=Integer.toString(n);
for(int i=0;i<s.length();i++)
{
a=s.charAt(i)+a;
}
int m=Integer.parseInt(a);
System.out.println(m);
System.out.println(m+n);
}}