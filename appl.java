import java.applet.*;
import java.awt.*;
public class appl extends Applet
{
public void paint(Graphics g)
{Font f=new Font("AR CENA",Font.ITALIC,65);
g.setFont(f);
	Color c=new Color(211,11,150);
	g.setColor(c);
g.drawOval(40,40,120,150);
g.setColor(Color.RED);
g.drawOval(57,75,30,20);
g.setColor(Color.GREEN);
g.drawOval(110,75,30,20);
g.fillOval(68,81,10,10);
g.fillOval(121,81,10,10);
g.drawOval(85,100,30,30);
g.fillArc(60,125,80,40,180,180);
g.drawOval(25,92,15,30);
g.drawOval(160,92,15,30);
g.setColor(Color.BLACK);
g.drawString("Nikhil Kalra",170,75);
}}
//<applet code="appl.class" height=768 width=1366></applet>