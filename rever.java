class rever
{
public static void main(String args[])
{
int a,b,c,num=123;c=0;
while(num>0)
{
a=num%10;
c=(c*10)+a;
num=num/10;
}
System.out.println(c);
}}
