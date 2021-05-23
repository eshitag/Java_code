import java.awt.Frame;
import java.awt.Button;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.TextField;
class gui6 extends Frame implements ActionListener
{
	Button btn1;
	Textfield txt1,txt2,txt3;

	public gui6()
	{

	FlowLayout FL=new FlowLayout();
	this.setLayout(FL);

	this.setTitle("my second gui application");
	this.setSize(400,400);
	
	txt1= new TextField(25);
	txt2=new TextField(25);
	txt3=new TextField(75);
	btn1= new Button("check");

btn1.addActionListener(this);


	this.add(btn1);
	this.add(txt1);
	this.add(txt2);
	this.add(txt3);
	}

	public void actionPerformed(ActionEvent evt)
	{
String a=txt1.getText();
String b=txt2.getText();

boolean b1=a.equals("spic");
boolean b2=b.equals("edc");

if(b1==true&&b2==true)
{
this.display("succeded");
}
else
{
this.display("login failed");
}

	}

}


class c11
{
	public static void main(String[]args)
	{
	gui6 obj=new gui6();
	obj.setVisible(true);
	}
}