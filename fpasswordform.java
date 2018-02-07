import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java .sql.*;

class fpasswordform extends Frame implements ActionListener
{
Label reset,rec_key,idtext,etext;
TextField trkey,textt,tnew;
Button cont,cancel,update;

Connection con=null;
Statement st1;
ResultSet rs;

fpasswordform()
{
setBackground(Color.BLACK);
reset=new Label("Reset Password");
rec_key=new Label("Enter Recovery Key");
idtext=new Label("Don't worry! Your Account is protected.");
etext=new Label("Enter the recovery key provided to you.");
trkey=new TextField();
textt=new TextField();
tnew=new TextField();
cont=new Button("Submit");
cancel=new Button("Cancel");
update=new Button("Update");

reset.setBounds(250,100,400,30);
rec_key.setBounds(260,230,400,35);
idtext.setBounds(220,270,355,35);
etext.setBounds(255,380,355,30);
trkey.setBounds(265,410,250,25);
cont.setBounds(345,440,90,25);
textt.setBounds(225,500,330,30);
tnew.setBounds(265,540,250,25);
update.setBounds(345,570,90,25);

update.setForeground(Color.WHITE);
update.setBackground(Color.BLACK);
textt.setBackground(Color.BLACK);
textt.setForeground(Color.WHITE);
cont.setForeground(Color.WHITE);
cont.setBackground(Color.BLACK);
trkey.setBackground(Color.WHITE);
rec_key.setBackground(Color.WHITE);
reset.setForeground(Color.WHITE);
idtext.setForeground(Color.WHITE);
etext.setBackground(Color.WHITE);
Font f=new Font("Cambria Math",Font.PLAIN,40);
reset.setFont(f);
Font s=new Font("Cambria Math",Font.PLAIN,30);
rec_key.setFont(s);
Font a=new Font("Cambria Math",Font.PLAIN,20);
idtext.setFont(a);
Font r=new Font("Cambria Math",Font.PLAIN,17);
etext.setFont(r);
textt.setFont(a);

add(reset);add(rec_key);add(idtext);add(etext);add(trkey);add(cont);add(textt);add(tnew);add(update);

cont.addActionListener(this);
//cancel.addActionListener(this);
update.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{String q=null,t=null,o=null;
if(e.getSource()==cont)
{
	String a,c;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:nk");
st1=con.createStatement();
rs=st1.executeQuery("select * from Details");
while(rs.next())
{
a=rs.getString("KEEY");	
System.out.print(a);
c=trkey.getText();
if(a.equals(c))
{
textt.setText("Enter your new password");
}
else
{
textt.setText("You have entered a wrong key");
}}}
catch(Exception g)
{
System.out.println("Error");
}}

if(e.getSource()==update)
{
o=trkey.getText();
t=tnew.getText();

try
{
rs=st1.executeQuery("update Details SET PASSWORD='"+t+"' where KEEY='"+o+"'");

}
catch(Exception ef)
{
	System.out.println("Error");
}}

}

public static void main(String args[])
{
fpasswordform log=new fpasswordform();
log.setLayout(null);
log.setVisible(true);
log.setSize(820,730);
}
public void paint(Graphics g)
{
g.setColor(Color.WHITE);
g.fillRect(0,200,820,730);
/*Color r=new Color(0,128,255);
g.setColor(r);*/
}
}
