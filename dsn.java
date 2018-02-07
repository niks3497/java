import java.lang.*;
import java .sql.*;
class dsn
{
public static void main(String args[])
{
String s1,s2,s3;
Connection con=null;
Statement st1;
ResultSet rs;

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:nk");

st1=con.createStatement();
rs=st1.executeQuery("select * from Tablenik");
while(rs.next())
{
s1=rs.getString(1);
s2=rs.getString(2);
s3=rs.getString(3);

System.out.println(s1+" "+s2+" "+s3);
}}
catch(Exception e)
{
System.out.println("Error");
}}}