import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class swinform extends JFrame
{
JLabel llogin=new JLabel("ACCOUNT LOGIN");
JLabel luname=new JLabel("USERNAME");
JLabel lpass=new JLabel("PASSWORD");
JButton bfpass=new JButton("Forgot Password?");

JLabel lnewuser=new JLabel("New User?");
JButton bsignup=new JButton("Sign up here");

JTextField tuname=new JTextField();
JTextField tpass=new JTextField();

//JCheckbox cbox=new JCheckbox("Remember me");

JButton blogin=new JButton("LOG IN");

swinform()
{
llogin.setBounds(200,150,170,30);
luname.setBounds(200,210,100,15);
tuname.setBounds(200,230,380,35);
lpass.setBounds(200,280,100,15);
tpass.setBounds(200,300,380,35);
//cbox.setBounds(200,350,100,20);
bfpass.setBounds(470,350,110,20);
blogin.setBounds(200,400,380,40);
lnewuser.setBounds(200,450,100,20);
bsignup.setBounds(200,470,100,20);

Color c=new Color(100,239,255);
setBackground(Color.BLACK);
llogin.setBackground(Color.WHITE);
luname.setBackground(Color.WHITE);
lpass.setBackground(Color.WHITE);
//cbox.setBackground(Color.WHITE);
bfpass.setBackground(Color.WHITE);
lnewuser.setBackground(Color.WHITE);
bsignup.setBackground(Color.WHITE);
bfpass.setToolTipText("hellllll");
Font f=new Font("Cambria Math",Font.BOLD,20);
llogin.setFont(f);
Color w=new Color(0,128,255);
llogin.setForeground(w);
bfpass.setForeground(w);
blogin.setBackground(w);
bsignup.setForeground(w);

blogin.setForeground(Color.WHITE);
Color e=new Color(221,221,221);
tuname.setBackground(e);
tpass.setBackground(e);

add(llogin);add(luname);add(tuname);add(tpass);add(lpass);
//add(cbox);
add(bfpass);add(blogin);
add(bsignup);add(lnewuser);
}
/*public void paint(Graphics g)
{
g.setColor(Color.WHITE);
g.fillRect(150,100,500,450);
Color r=new Color(0,128,255);
g.setColor(r);
g.fillRect(650,100,20,450);
}*/
public static void main(String args[])
{
swinform log=new swinform();
log.setLayout(null);
log.setVisible(true);
log.setSize(820,730);
}}
