import java.awt.Frame;
import java.awt.Button;

class gui2 extends Frame
{
	Button btn1;

	public gui2()
	{
	this.setSize(400,400);
	this.setTitle("Second application");

	btn1=new Button("Exit");
	this.add(btn1);
	}
}

class c7
{
	public static void main(String[]args)
	{
	gui2 obj=new gui2();
	obj.setVisible(true);
	}
}