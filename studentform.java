import java.lang.*;
import java .sql.*;
import java.awt.*;
import java.awt.event.*;

class studentform extends Frame implements ActionListener
{
Connection con=null;
Statement st1;
ResultSet rs;
String sgender;
String s2,s3;

Label lstinfo;
Label lname;
Label ldob;
Label lid;
Label lcontact;
Label lgender;

TextField tname;
TextField tdob;
TextField tid;
TextField tcontact;

CheckboxGroup cg=new CheckboxGroup();
Checkbox male;//=new Checkbox()"Male",cg,true);
Checkbox female;//=new Checkbox()"Female",cg,false);

Button bsub;
Button bdel;
Button bupd;
Button bsearch;
Button bfd;
Button bbd;

studentform()
{
lstinfo=new Label("STUDENT INFO");
lname=new Label("Name");
ldob=new Label("Date of birth");
lid=new Label("Student ID");
lcontact=new Label("Contact");
lgender=new Label("Gender");

tname=new TextField();
tdob=new TextField();
tid=new TextField();
tcontact=new TextField();
	
male=new Checkbox("male",cg,true);
female=new Checkbox("female",cg,false);

bsub=new Button("Submit");
bdel=new Button("Delete");
bupd=new Button("Update");
bsearch=new Button("Search");
bfd=new Button("Next Page");
bbd=new Button("Previous Page");

lstinfo.setBounds(200,130,250,40);
lname.setBounds(200,190,100,25);
tname.setBounds(350,190,130,20);
ldob.setBounds(200,230,100,25);
tdob.setBounds(350,230,130,20);
lid.setBounds(200,270,100,20);
tid.setBounds(350,270,130,20);
lcontact.setBounds(200,310,100,20);
tcontact.setBounds(350,310,130,20);
lgender.setBounds(200,350,100,20);
male.setBounds(350,350,50,20);
female.setBounds(410,350,60,20);
bsub.setBounds(240,390,90,25);
bdel.setBounds(350,390,90,25);
bupd.setBounds(240,430,90,25);
bsearch.setBounds(350,430,90,25);
bbd.setBounds(150,500,90,25);
bfd.setBounds(510,500,90,25);

Color c=new Color(100,239,255);
setBackground(Color.BLACK);
lstinfo.setBackground(Color.WHITE);
lname.setBackground(Color.WHITE);
ldob.setBackground(Color.WHITE);
lid.setBackground(Color.WHITE);
lcontact.setBackground(Color.WHITE);
lgender.setBackground(Color.WHITE);
male.setBackground(Color.WHITE);
female.setBackground(Color.WHITE);

Font f=new Font("Cambria Math",Font.BOLD,30);
lstinfo.setFont(f);
Color w=new Color(0,128,255);
lstinfo.setForeground(w);
lname.setForeground(w);
lcontact.setForeground(w);
ldob.setForeground(w);
lgender.setForeground(w);
lid.setForeground(w);
male.setForeground(Color.GREEN);
female.setForeground(Color.PINK);
bsub.setBackground(w);
bdel.setBackground(w);
bsearch.setBackground(w);
bupd.setBackground(w);
bsub.setForeground(Color.WHITE);
bdel.setForeground(Color.WHITE);
bsearch.setForeground(Color.WHITE);
bupd.setForeground(Color.WHITE);
bbd.setForeground(w);
bfd.setForeground(w);
bbd.setBackground(Color.BLACK);
bfd.setBackground(Color.BLACK);

/*blogin.setForeground(Color.WHITE);
Color e=new Color(221,221,221);
tuname.setBackground(e);
tpass.setBackground(e);*/

add(lstinfo);add(lname);add(tname);add(ldob);add(tdob);add(tcontact);add(lcontact);add(lid);
add(tid);add(lgender);add(male);add(female);add(bsearch);add(bdel);add(bupd);add(bsub);
add(bbd);add(bfd);

bdel.addActionListener(this);
bsub.addActionListener(this);
bsearch.addActionListener(this);
bupd.addActionListener(this);
bfd.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:nk");
st1=con.createStatement();
}
catch(Exception e2)
{
System.out.println("Error");
}
if(e.getSource()==bdel)
{
String s1;
s1=tid.getText();
try
{
rs=st1.executeQuery("delete from STUDENT where ID="+"'"+s1+"'"); 
}
catch(Exception e1)
{
	System.out.println("Error");
}}
if(e.getSource()==bsub)
{
try
{
String sname=tname.getText();
String sdob=tdob.getText();
String sid=tid.getText();
String scontact=tcontact.getText();

if(male.getState()==true)
sgender="male";
if(female.getState()==true)
sgender="female";

rs=st1.executeQuery("Insert into STUDENT values("+"'"+sname+"','"+sdob+"','"+sid+"','"+scontact+"','"+sgender+"')");
}
catch(Exception ee)
{
System.out.println("Error");
}}

if(e.getSource()==bsearch)
{

s2=tid.getText();
try
{
rs=st1.executeQuery("select * from STUDENT where ID="+"'"+s2+"'");
while(rs.next())
{
tname.setText(rs.getString("Name"));
tdob.setText(rs.getString("DOB"));
tcontact.setText(rs.getString("Contact"));
s3=rs.getString("Gender");
if(s3.equals("male"))
{
	male.setState(true);
}
else
{
	female.setState(true);
}
}}
catch(Exception eee)
{
System.out.println("Error");
}}
if(e.getSource()==bupd)
{
try
{
rs=st1.executeQuery("update STUDENT SET Name='geet' where ID='03'");
System.out.print("update");
}
catch(Exception ef)
{
	System.out.println("Error");
}}
if(e.getSource()==bfd)
{
	loginform obj=new loginform();
	obj.setSize(820,730);
	obj.setVisible(true);
	dispose();
}}

public static void main(String args[])
{
studentform log=new studentform();
log.setLayout(null);
log.setVisible(true);
log.setSize(820,730);
}
public void update(Graphics g)
{
	paint(g);
}
public void paint(Graphics g)
{
g.setColor(Color.WHITE);
g.fillRect(150,100,450,400);
Color r=new Color(0,128,255);
g.setColor(r);
g.fillRect(550,100,5,400);
g.fillRect(150,115,450,5);
}
}
