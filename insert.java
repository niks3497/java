class insert
{
public static void main(String args[])
{
int a[]=new int[10];a[0]=1;a[1]=3;a[2]=4;a[3]=7;a[5]=2;
int pos=2;
for(int i=0;i<6;i++)
{
System.out.println(a[i]);
}
System.out.println("\n");
for(int j=5;j>=pos;j--)
{
a[j+1]=a[j];
}
a[pos]=10;
for(int p=0;p<7;p++)
{
System.out.println(a[p]);
}}}

