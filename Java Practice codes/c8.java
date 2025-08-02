import java.awt.Frame;
import java.awt.Button;
import java.awt.event.*;

class gui3 extends Frame implements ActionListener
{
Button btn1;
	public gui3()
{
	this.setTitle("third example with button");
	this.setSize(400,600);

	btn1=new Button("exit");
	btn1.addActionListener(this);	

	this.add(btn1);
}
	public void actionPerformed(ActionEvent evt)
	{
	this.dispose();
	}


}

class c8
{
public static void main(String[]args)
{gui3 obj=new gui3();
obj.setVisible(true);}
}