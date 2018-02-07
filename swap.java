import java.awt.*;
import java.awt.event.*;
class swap extends Frame implements ActionListener
{
Label lswap,lfnum,lsnum;
TextField tfnum,tsnum;
Button bswap;Button bexit;
swap()
{
setLayout(new FlowLayout());
lswap=new Label("SwAp");
lfnum=new Label("First Number");
lsnum=new Label("Second Number");

tfnum=new TextField(10);
tsnum=new TextField(10);


bswap=new Button("SwAp");
bexit=new Button("Exit");

add(lswap);
add(lfnum);add(tfnum);
add(lsnum);add(tsnum);
add(bswap);add(bexit);
bswap.addActionListener(this);
bexit.addActionListener(this);

lfnum.setForeground(Color.RED);
lsnum.setForeground(Color.RED);
tfnum.setBackground(Color.BLUE);
tsnum.setBackground(Color.BLUE);
bswap.setBackground(Color.WHITE);
bexit.setBackground(Color.WHITE);
bswap.setForeground(Color.GREEN);
bexit.setForeground(Color.GREEN);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==bswap)
{
String temp;
temp=tfnum.getText();
tfnum.setText(tsnum.getText());
tsnum.setText(temp);
}
if(e.getSource()==bexit)
{
	System.exit(0);
}
}
public static void main(String args[])
{
swap f=new swap();
f.setSize(768,1366);
f.setVisible(true);
}
}

