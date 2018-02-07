import java.applet.*;
import java.awt.*;
public class applii extends Applet
{
	Image picture;
public void init()
{
	picture=getImage(getDocumentBase(),"Imagecalc.png");
Label lhead,lname,lid,lclass;
TextField tname,tid,tclass;
Button bsub,bclear;

lhead=new Label("Student Details");
lname=new Label("Name");
lid=new Label("ID");
lclass=new Label("Class");

tname=new TextField(25);
tid=new TextField(25);
tclass=new TextField(25);

bsub=new Button("Submit");
bclear=new Button("Clear");

add(lhead);
add(lname);add(tname);
add(lid);add(tid);
add(lclass);add(tclass);
add(bsub);add(bclear);
}
public void paint(Graphics g)
{
	g.drawImage(picture,5,5,this);
}}
//<applet code="applii.class" height=400 width=350></applet>