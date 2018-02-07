import java.applet.*;
import java.awt.*;
public class apple extends Applet
{
	public void init()
	{
		Color c=new Color(100,239,255);
		setBackground(c);
	}
public void paint(Graphics g)
{
g.setColor(Color.WHITE);
g.fillRect(150,100,500,500);

}}
//<applet code="apple.class" height=768 width=800></applet>