import java.awt.*;
class framdemo extends Frame
{
public static void main(String args[])
{
framdemo f=new framdemo();
f.setSize(768,1366);
f.setVisible(true);
f.setTitle("FRAME");
}
public void paint(Graphics g)
{
	Font f=new Font("Arial",Font.ITALIC,65);
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
}
}