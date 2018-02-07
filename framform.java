import java.awt.*;
class framform extends Frame
{Label lhead,lname,lid,lclass;
TextField tname,tid,tclass;
Button bsub,bclear;
framform()
{
	setLayout(new FlowLayout());


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
public static void main(String args[])
{
framform f=new framform();
f.setSize(768,1366);
f.setVisible(true);
f.setTitle("FORM");
}}