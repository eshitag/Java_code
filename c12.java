import java.awt.Frame;
import java.awt.Button;
import java.awt.event.*;
import java.awt.TextField;
import java.awt.FlowLayout;

class gui7 extends Frame implements ActionListener
{
Button btn1,btn2;
TextField txt1,txt2,txt3;

public gui7()
{

	FlowLayout FL=new FlowLayout();
	this.setLayout(FL);

	this.setTitle("my third gui application");
	this.setSize(400,400);

	btn1= new Button("show");
	btn2=new Button("close");

btn1.addActionListener(this);
btn2.addActionListener(this);


	this.add(txt1);
	this.add(txt2);
	this.add(txt3);
	this.add(btn1);
	this.add(btn2);
}

	public void actionPerformed(ActionEvent evt)
	{
Object source=evt.getSource();

if(source==btn1)
{
String a=txt1.getText();
String b=txt2.getText();

txt3.setText(a.concat(b));
}
else if(source==btn2)
{
this.dispose();
}

	}
}

class c12
{
	public static void main(String[]args)
	{
	gui7 obj=new gui7();
	obj.setVisible(true);
	}
}