class abc 
{
public int a;
public int b;//b has private access in abc
protected int c;
public void get()
{
a=5;b=3;c=9;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}}
class dd extends abc
{
public void set()
{
a=10;b=20;c=30;
abc obj1=new abc();
obj1.get();
obj1.a=10;obj1.b=20;obj1.c=30;
System.out.println(obj1.a);
System.out.println(obj1.b);
System.out.println(obj1.c);
}}

class mainn
{
public static void main(String args[])
{
abc obj2=new abc();
obj2.a=90;obj2.b=100;obj2.c=120;
System.out.println(obj2.a);
System.out.println(obj2.b);
System.out.println(obj2.c);
 dd obj3=new dd();
 obj3.a=130;obj3.b=140;obj3.c=10;
System.out.println(obj3.a);
System.out.println(obj3.b);
System.out.println(obj3.c);
obj3.set();
}}
 