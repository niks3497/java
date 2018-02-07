import java.awt.*;
import java.awt.event.*;

class calculatorr extends Frame implements ActionListener
{
Label lfnum=new Label("First Number");
Label lsnum=new Label("Second Number");
Label lresult=new Label("Result");

TextField tfnum=new TextField();
TextField tsnum=new TextField();
TextField tresult=new TextField();

Button badd=new Button("Add");
Button bsub=new Button("Sub");
Button bmul=new Button("Mul");
Button bdiv=new Button("Div");
Button bcancel=new Button("Cancel");

calculatorr()
{
lfnum.setBounds(50,100,100,20);
lsnum.setBounds(50,140,100,20);
lresult.setBounds(50,180,100,20);

tfnum.setBounds(200,100,100,20);
tsnum.setBounds(200,140,100,20);
tresult.setBounds(200,180,100,20);

badd.setBounds(50,250,50,20);
bsub.setBounds(110,250,50,20);
bmul.setBounds(170,250,50,20);
bdiv.setBounds(230,250,50,20);
bcancel.setBounds(290,250,50,20);

setBackground(Color.BLACK);
lfnum.setForeground(Color.WHITE);
lsnum.setForeground(Color.WHITE);
lresult.setForeground(Color.WHITE);

add(lfnum);
add(lsnum);
add(lresult);
add(tfnum);
add(tsnum);
add(tresult);
add(badd);
add(bsub);
add(bmul);
add(bdiv);
add(bcancel);

badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bcancel.addActionListener(this);

badd.setBackground(Color.BLUE);
bsub.setBackground(Color.BLUE);
bmul.setBackground(Color.BLUE);
bdiv.setBackground(Color.BLUE);
bcancel.setBackground(Color.BLUE);
badd.setForeground(Color.WHITE);
bsub.setForeground(Color.WHITE);
bmul.setForeground(Color.WHITE);
bdiv.setForeground(Color.WHITE);
bcancel.setForeground(Color.WHITE);
}
	
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(tfnum.getText());
int n2=Integer.parseInt(tsnum.getText());

if(e.getSource()==badd)
{
tresult.setText(String.valueOf(n1+n2));
}

if(e.getSource()==bsub)
{
tresult.setText(String.valueOf(n1-n2));
}

if(e.getSource()==bmul)
{
tresult.setText(String.valueOf(n1*n2));
}

if(e.getSource()==bdiv)
{
tresult.setText(String.valueOf(n1/n2));
}

if(e.getSource()==bcancel)
{
System.exit(0);
}
}
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
g.fillRect(45,95,105,25);
g.fillRect(45,135,105,25);
g.fillRect(45,175,105,25);
}
public static void main(String args[])
{
calculatorr cal=new calculatorr();
cal.setLayout(null);
cal.setVisible(true);
cal.setSize(768,1366);
}
}