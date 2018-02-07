class selection
{
public static void main(String aa[])
{
int num1,num2,num3;
num1=Integer.parseInt(aa[0]);
num2=Integer.parseInt(aa[1]);
num3=Integer.parseInt(aa[2]);
if(num1>num2)
{	
	if(num1>num3)
	{
		System.out.println(num1+" is greatest");
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		}
		else
		{ 
		System.out.println(num3+" is greatest");
		System.out.println(num3>num2);
		}}
		else
		{
		if(num2>num3)
		{
		System.out.println(num2+" is greatest");
		System.out.println((num2>num1)&&(num2>num3));
		System.out.println((num3>num2)||(num1>num2));
		}
		else
		{
		System.out.println(num3+" is greatest");
		System.out.println((num3>num2)?num3:num2);
		}}
		
		if((num1>num2)&&(num1>num3))
		{
		System.out.println(num1+" is greatest");
		System.out.println((num1*2)-(num2/2)+(num3%2));
		}
		else if((num2>num3)&&(num2>num1))
		{
		System.out.println(num2+" is greatest");
		System.out.println((num1>num2)?num1:num2);
		}
		else
		{
		System.out.println(num3+" is greatest");
		}}}
		 