import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Color;

class gui4 extends Frame
{
	Button btn1, btn2;

	public gui4()
{
FlowLayout FL= new FlowLayout();

this.setLayout(FL);

this.setSize(500,500);
this.setTitle("Button example");

btn1=new Button("change");
btn2=new Button("Exit");

btn1.addActionListener(this);
btn2.addActionListener(this);

this.add(btn1);
this.add(btn2);
}

	public void actionPerformed(ActionEvent evt)
{
this.dispose();
}

}


class c9
{
public static void main(String[]args)
{
gui4 obj=new gui4();
obj.setVisible(true);
}
}