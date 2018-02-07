import java.util.*;
class vectImp
{
public static void main(String str[])
{
Vector vect=new Vector();
int l=str.length;
for(int i=0;i<l;i++)
{
vect.addElement(str[i]);
}
vect.insertElementAt("nikhil",5);
int newl=vect.size();
String ar[]=new String[newl];
vect.copyInto(ar);
for(int i=0;i<newl;i++)
{System.out.println(ar[i]);
}}}

