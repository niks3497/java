class fncn
{
int num1,num2,num3;
public void f1()
{
num1=10; num2=9; num3=8;
if(num1%2==0)
{
if(num3%2==0)
System.out.println(num1+" & "+num3+" are even numbers");
}}
public int f2()
{
return ((num1%2)+(num2*3)+(num3-3));
}}

class fncn2
{
	int num1,num2,num3;
public void f3()
{
	num1=10; num2=9; num3=8;
System.out.println((num1%5)+(num2%4)+(num3%3));
for(int i=3;i<num3;i++)
{
for(int j=3;j<=i;j++)
{
System.out.print("*");
}}}
public int f4()
{
int fact=1;
for(int p=1;p<num1;p++)
{
fact=fact*p;
}
return (fact);
}}

class function
{
public static void main(String aa[])
{
fncn obj1= new fncn();
fncn2 obj2= new fncn2();
obj1.f1();
System.out.println(obj1.f2());
obj2.f3();
System.out.println(obj2.f4());
}}