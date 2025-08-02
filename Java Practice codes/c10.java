import java.awt.Frame;
import java.awt.Button;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;

class gui5 extends Frame implements ActionListener
{
Button btn1,btn2,btn3,btn4,btn5;

public gui5()
{

	FlowLayout FL=new FlowLayout();
	this.setLayout(FL);

	this.setTitle("my first gui application");
	this.setSize(400,400);

	btn1= new Button("Red");
	btn2=new Button("Green");
	btn3=new Button("Blue");
	btn4=new Button("Black");
	btn5=new Button("Close");

btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);
btn5.addActionListener(this);

	this.add(btn1);
	this.add(btn2);
	this.add(btn3);
	this.add(btn4);
	this.add(btn5);
}

	public void actionPerformed(ActionEvent evt)
{
Object source=evt.getSource();

if(source==btn1)
{
this.setBackground(Color.red);
}
else if(source==btn2)
{
this.setBackground(Color.green);
}
else if(source==btn3)
{
this.setBackground(Color.blue);
}
else if(source==btn4)
{
this.setBackground(Color.black);
}
else if(source==btn5)
{
this.dispose();
}

}

}

class c10
{
	public static void main(String[]args)
	{
	gui5 obj=new gui5();
	obj.setVisible(true);
	}
}