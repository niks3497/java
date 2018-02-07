class operators
{
public static void main(String aa[])
{
int fno=3,sno=2,tno=1,a;

if((fno>sno)&&(fno>tno))
System.out.println("fno is greatest");
else if((sno>fno)&&(sno>tno))
System.out.println("sno is greatest");
else
System.out.println("tno is greatest");

a=(fno>sno)?fno:sno;
System.out.println(a);
System.out.println(fno!=sno);

}}
