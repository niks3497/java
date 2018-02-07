import java.lang.Math.*;
import java.io.*;
import java.util.*;
class ss
{
public static void main(String aa[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int t=Integer.parseInt(br.readLine());
while(t>0)
//System.out.println("Enter the number of characters of string");
{
	int n=Integer.parseInt(br.readLine());
String s;String str[]=new String[n];
//System.out.println("Enter a string");
s=br.readLine();
int a[]=new int[n];
for(int i=0;i<n;i++) 
{
a[i]=s.charAt(i);
//System.out.println(a[i]);
}
int a1[]={67,71,73,79,83,89};
int a2[]={69,72,76,81,86};
for(int p=0;p<n;p++)
{

	for(int q=0;q<5;q++)
	{
		if(a[p]==a2[q])
		{
			a[p]=a1[q];
			//System.out.println(a[p]);
}}}

//for(int i=0;i<n;i++)
//{System.out.println(a[i]);
//}

for(int x=0;x<n;x++)
{
	for(int y=0;y<n;y++)
	{
		//System.out.println("hye");
		if((a1[y]!=a[x]))
		{
			if(((Math.abs(a1[y]-a[x]))==1)||((Math.abs(a1[y]-a[x]))==2))	
			{
			a[x]=a1[y];
			//System.out.println(a[x]);
			break;
		}
	}
}
}

for(int i=0;i<n;i++)
{
	str[i]=Character.toString((char)a[i]);
}
for(int i=0;i<n;i++)
{
	System.out.print(str[i]);
}
t--;
System.out.println();
}
}}