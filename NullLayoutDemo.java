import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class nulllayoutdemo
{
nulllayoutdemo() 
{
JFrame fr = new JFrame();
fr.setLayout(null);
JButton btn1 = new JButton("Button 1");
JButton btn2 = new JButton("Button 2");
JButton btn3 = new JButton("Button 3");
JButton btn4 = new JButton("Button 4");
btn1.setBounds(50, 30, 100, 50);// Left,Top,Width,Height
fr.add(btn1);
btn2.setBounds(50, 100, 100, 50);// Left,Top,Width,Height
fr.add(btn2);
btn3.setBounds(50, 170, 100, 50);// Left,Top,Width,Height
fr.add(btn3);
btn4.setBounds(50, 240, 100, 50);// Left,Top,Width,Height
fr.add(btn4);
fr.setVisible(true);
fr.setSize(250, 400);
}
public static void main(String[] args)
{
new nulllayoutdemo();
}}