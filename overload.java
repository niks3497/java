class over1
{double area;
public double calc(double r)
{
area=3.14*r*r;
return(area);
}

public double calc(int x,double y)
{
	area=(double)x*y;
	return(area);
}

public int calc(int a)
{
area=(double)a*a;
return(area);
}
}

class overload
{
public static void main(String aa[])
{
over1 obj1=new over1();
System.out.println("area of circle=");
System.out.println(obj1.calc(4.22));
System.out.println("area of rectangle=");
System.out.println(obj1.calc(5,6));
System.out.println("area of square=");
System.out.println(obj1.calc(2));
}}