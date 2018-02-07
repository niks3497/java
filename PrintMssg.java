public class PrintMssg extends Thread
{
String mssg;
PrintMssg(String mssg)
{
this.mssg=mssg;
}
public void run()
{
try
{
for(; ;)
{
System.out.println("Hello!"+mssg+"Welcome.");
sleep(1000);
}
}
catch(Exception erro)
{
System.out.println(erro);
}
}
public static void main(String args[])
{
PrintMssg thread1=new PrintMssg("Welcome");
PrintMssg thread2=new PrintMssg("XCnotes.com");
thread1.start();
thread2.start();
}
}