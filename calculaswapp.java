import java.awt.*;
import java.awt.event.*;

class calculaswapp extends Frame implements ActionListener
{
Label lfnum=new Label("First Number");
Label lsnum=new Label("Second Number");
Label lresult=new Label("Result");
Label lfn=new Label("First Number");
Label lsn=new Label("Second Number");
Label lswap=new Label("SWAPPING");
Label lcalc=new Label("CALCULATOR");
 
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
Button bclear=new Button("AC");
Button bnext=new Button("Next");
Image img,img1;

calculaswapp()
{
lfnum.setBounds(50,100,100,20);
lsnum.setBounds(50,140,100,20);
lresult.setBounds(50,180,100,20);
lfn.setBounds(500,100,100,20);
lsn.setBounds(500,140,100,20);
lswap.setBounds(600,50,105,25);
lcalc.setBounds(140,50,105,25);

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
bswap.setBounds(550,190,50,20);
bexit.setBounds(630,190,50,20);
bclear.setBounds(170,280,50,20);
bnext.setBounds(700,190,50,20);

setBackground(Color.BLACK);
lfnum.setForeground(Color.WHITE);
lsnum.setForeground(Color.WHITE);
lresult.setForeground(Color.WHITE);
lfn.setForeground(Color.WHITE);
lsn.setForeground(Color.WHITE);
lswap.setForeground(Color.GREEN);
lcalc.setForeground(Color.GREEN);

//picture=getImage(getDocumentBase(),"Imagecalc.jpg");

Font f=new Font("Arial",Font.BOLD,14);
lcalc.setFont(f);
lswap.setFont(f);

MediaTracker mt=new MediaTracker(this);
img=Toolkit.getDefaultToolkit().getImage("imagecalc.png");
mt.addImage(img,0);
MediaTracker mt1=new MediaTracker(this);
img1=Toolkit.getDefaultToolkit().getImage("swapicon.png");
mt1.addImage(img1,0);

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
add(lcalc);
add(bclear);
add(bnext);

badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bcancel.addActionListener(this);
bswap.addActionListener(this);
bexit.addActionListener(this);
bclear.addActionListener(this);
bnext.addActionListener(this);

badd.setBackground(Color.BLUE);
bsub.setBackground(Color.BLUE);
bmul.setBackground(Color.BLUE);
bdiv.setBackground(Color.BLUE);
bcancel.setBackground(Color.BLUE);
bswap.setBackground(Color.BLUE);
bexit.setBackground(Color.BLUE);
bclear.setBackground(Color.BLUE);
bnext.setBackground(Color.BLUE);

badd.setForeground(Color.WHITE);
bsub.setForeground(Color.WHITE);
bmul.setForeground(Color.WHITE);
bdiv.setForeground(Color.WHITE);
bcancel.setForeground(Color.WHITE);
bswap.setForeground(Color.WHITE);
bexit.setForeground(Color.WHITE);
bclear.setForeground(Color.WHITE);
bnext.setForeground(Color.WHITE);

}
	
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==badd)
{
int n1=Integer.parseInt(tfnum.getText());
int n2=Integer.parseInt(tsnum.getText());
tresult.setText(String.valueOf(n1+n2));
}

if(e.getSource()==bsub)
{
int n1=Integer.parseInt(tfnum.getText());
int n2=Integer.parseInt(tsnum.getText());
tresult.setText(String.valueOf(n1-n2));
}

if(e.getSource()==bmul)
{
int n1=Integer.parseInt(tfnum.getText());
int n2=Integer.parseInt(tsnum.getText());	
tresult.setText(String.valueOf(n1*n2));
}

if(e.getSource()==bdiv)
{
int n1=Integer.parseInt(tfnum.getText());
int n2=Integer.parseInt(tsnum.getText());	
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

if(e.getSource()==bclear)
{
	tfnum.setText("");
	tsnum.setText("");
	tresult.setText("");
	tfn.setText("");
	tsn.setText("");
}

if(e.getSource()==bnext)
{
	framform obj2=new framform();
	obj2.setVisible(true);
	obj2.setSize(500,650);
	obj2.tname.setText("Nikhil");
	obj2.tid.setText("22");
}
}
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
g.fillRect(45,95,105,25);
g.fillRect(45,135,105,25);
g.fillRect(45,175,105,25);
g.fillRect(495,95,105,25);
g.fillRect(495,135,105,25);
//g.drawImage(picture,170,270,this);
if(img!=null)
{
g.drawImage(img,170,320,this);
}
if(img1!=null)
{
g.drawImage(img1,590,220,this);
}
}
public static void main(String args[])
{
calculaswapp cal=new calculaswapp();
cal.setLayout(null);
cal.setVisible(true);
cal.setSize(768,1366);
}
}