class test
{ 
public int fn(int a,int b,int c)
{
	int x;
switch(c)
{
case 1: x=a+b;
	   return (x);
	   //break;

case 2: x=((a>b)?a:b);
        return (x);
		//break;

default: return (0);
}}}
 class test1
 { 
 public static void main(String aa[])
 {
 test obj1= new test();
 int p,q,r;
 p=Integer.parseInt(aa[0]);
 q=Integer.parseInt(aa[1]);
 r=Integer.parseInt(aa[2]);
 System.out.println(obj1.fn(p,q,r));
 }}