class gparents
{int x,y; 
public void f1()
{x=5;y=10;
System.out.println(x+"&"+y);
System.out.println("I am the grandfather");
}
public static void main(String args[])
{
child obj1=new child();
obj1.f1();
obj1.f2();
obj1.f3();
}}


class parents extends gparents
{
public void f2()
{
System.out.println(x+"&"+y);
System.out.println("I am the father");
}}

class child extends parents
{
public void f3()
{
System.out.println(x+"&"+y);
System.out.println("i am the child");
}}




