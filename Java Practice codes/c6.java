import java.awt.Frame;

class gui1 extends Frame
{
	public gui1()
	{
	this.setSize(400,400);
	this.setTitle("First GUI application");
	}

}

class c6
{
	public static void main(String[]args)
	{
	gui1 obj=new gui1();
	obj.setVisible(true);
	}
}