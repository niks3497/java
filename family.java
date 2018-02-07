class grandp
{
	int x=80,y=50;
public void f1()
{
System.out.println("I am the head of the family");
//x=80;y=50;
System.out.println("My age is "+x);
}}

class fparent extends grandp
{
public void f2()
{
System.out.println("i am the first child");
System.out.println("my age is "+(x-y+10));
}}

class sparent extends grandp
{
public void f3()
{
System.out.println("i am the second child");
System.out.println("my age is "+(x-y));
}}

class fpchild1 extends fparent
{
public void f4()
{
System.out.println("i am the first child of first parent");
System.out.println("my age is "+((x-y)-15));
}}

class fpchild2 extends fparent
{
public void f5()
{
System.out.println("i am the second child of first parent");
System.out.println("my age is "+((x-y)-17));
}}

class spchild1 extends sparent
{
public void f6()
{
System.out.println("i am the first child of second parent");
System.out.println("my age is "+((x-y)-14));
}}

class spchild2 extends sparent
{
public void f7()
{
System.out.println("i am the second child of second parent");
System.out.println("my age is "+((x-y)-16));
}}

class family
{
public static void main(String args[])
{
fpchild1 obj1=new fpchild1();
fpchild2 obj2=new fpchild2();
spchild1 obj3=new spchild1();
spchild2 obj4=new spchild2();
obj1.f1();
obj1.f2();
obj3.f3();
obj1.f4();
obj2.f5();
obj3.f6();
obj4.f7();
}}