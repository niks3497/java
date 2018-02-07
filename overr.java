class overr
{
int a,b,c;
public void sum()
{
a=4;
b=3;
c=a+b;
System.out.println(c);
}
public int sum(int m,int n)
{

c=m+n;
return(c);
}
public static void main(String aa[])
{
overr ob1=new overr();
ob1.sum();
System.out.println(ob1.sum(2,4));
}
}