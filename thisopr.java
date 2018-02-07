class this_opr
{int a,b;
public void f1(int a,int b)
{
this.a=a;
this.b=b;
int c;
c=a;
a=b;
b=c;
System.out.println("swapped values "+a+" "+b);
}
public int f2()
{
int n;
n=(a>b)?a:b;
return (n);
}}
 class thisopr
 {
 public static void main(String aa[])
 {
 this_opr obj1= new this_opr();
 int p,q;
 p=Integer.parseInt(aa[0]);
 q=Integer.parseInt(aa[1]);
 obj1.f1(p,q);
 System.out.println(obj1.f2());
 }}