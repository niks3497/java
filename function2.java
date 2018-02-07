class fnc
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

class fnc2
{ int x,y;
public void f3(int num1,int num2)
{x=num1;y=num2;
int c;
c=num1;
num1=num2;
num2=c;
System.out.println("swapped values "+num1+" "+num2);
}
public int f4()
{
int n;
n=(x>y)?x:y;
return (n);
}}

class function2
{
public static void main(String aa[])
{
fnc obj1= new fnc();
fnc2 obj2= new fnc2();
int l,m;
l=Integer.parseInt(aa[0]);
m=Integer.parseInt(aa[1]);
obj2.f3(l,m);
System.out.println(obj2.f4());
}}