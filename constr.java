class cons1
{
int num1,num2,num3;
cons1()
{this(3);
num1=10;num2=2;
num3=num1*num2;
System.out.println("num3="+num3);
}
cons1(int x)
{this(4,5);
num1=x;
System.out.println(num1);
}
cons1(int x,int y)
{
if(x>y)
System.out.println(x+" is greater");
else
System.out.println(y+" is greater");
}}
class constr
{
public static void main(String aa[])
{
cons1 obj1=new cons1();
}}