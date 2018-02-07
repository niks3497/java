import java.awt.*;
import java.awt.event.*;

class calculatorswap extends Frame implements ActionListener
{
Label lfnum=new Label("First Number");
Label lsnum=new Label("Second Number");
Label lresult=new Label("Result");
Label lfn=new Label("First Number");
Label lsn=new Label("Second Number");
Label lswap=new Label("Swap");
 
TextField tfnum=new TextField();
TextField tsnum=new TextField();
TextField tresult=new TextField();
TextField tfn=new TextField();
TextField tsn=new TextField();

Button badd=new Button("Add");
Button bsub=new Button("Sub");
Button bmul=new Button("Mul");
Button bdiv=new Button("Div");
Button bcancel=new Button("Cancel");
Button bswap=new Button("Swap");
Button bexit=new Button("Exit");

calculatorswap()
{
lfnum.setBounds(50,100,100,20);
lsnum.setBounds(50,140,100,20);
lresult.setBounds(50,180,100,20);
lfn.setBounds(500,100,100,20);
lsn.setBounds(500,140,100,20);
lswap.setBounds(540,70,100,20);

tfnum.setBounds(200,100,100,20);
tsnum.setBounds(200,140,100,20);
tresult.setBounds(200,180,100,20);
tfn.setBounds(650,100,100,20);
tsn.setBounds(650,140,100,20);

badd.setBounds(50,250,50,20);
bsub.setBounds(110,250,50,20);
bmul.setBounds(170,250,50,20);
bdiv.setBounds(230,250,50,20);
bcancel.setBounds(290,250,50,20);
bswap.setBounds(520,250,50,20);
bexit.setBounds(590,250,50,20);

setBackground(Color.WHITE);
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
add(lswap);
add(lfn);
add(lsn);
add(tfn);
add(tsn);
add(bswap);
add(bexit);

badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bcancel.addActionListener(this);
bswap.addActionListener(this);
bexit.addActionListener(this);

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

if(e.getSource()==bswap)
{
String temp;
temp=tfn.getText();
tfn.setText(tsn.getText());
tsn.setText(temp);
}

if(e.getSource()==bexit)
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
calculatorswap cal=new calculatorswap();
cal.setLayout(null);
cal.setVisible(true);
cal.setSize(768,1366);
}
}