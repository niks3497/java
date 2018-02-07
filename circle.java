class circle
{
public static void main(String args[])
{int i,j,r=0;
for(i=-r;i<r;i++)
{ 
for(j=-r;j<r;j++)
{
if(i*i+j*j<r*r)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}}}