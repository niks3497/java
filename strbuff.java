class strbuff
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("My name is Nikhil kalra");
System.out.println("Orginal string: "+str);
int l=str.length();
String str1=new String(" & i am 20 yrs old");
str.insert(10,str1);
System.out.println("Modified string: "+str);
str.setCharAt(7,'*');
System.out.println("Modified string: "+str);
str.append(str1);
System.out.println("Modified string: "+str);
}}