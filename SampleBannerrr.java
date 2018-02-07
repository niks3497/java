import java.awt.*;
import java.applet.*;
public class SampleBannerrr extends Applet implements Runnable
{
String strr=" HELLO";
Thread t ;
boolean b;
public void init()
{
setBackground(Color.BLACK); 
Font f1=new Font("Arial",Font.BOLD,50); 
setFont(f1);
}
public void start()
{
t = new Thread(this);
b = false;
t.start();
}
public void run ()
{
char ch;
for( ; ; ) 
{
try
{
repaint();
Thread.sleep(250);            //modernabh@gmail.com
ch = strr.charAt(0);

//strr = strr.substring(1,strr.length());
strr = strr + ch; 
}
catch(InterruptedException e)
{
System.out.println("Error in thread");
}
}
}
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
g.fillRect(10,1,1400,100);
g.setColor(Color.WHITE);
g.drawString(strr, 50, 50);
}
}
/*<applet code="SampleBannerrr.class" height=768 width=1300></applet>*/