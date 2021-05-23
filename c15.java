import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.*;

class gui10 extends JFrame implements ActionListener
	{
	JButton btn1;
	JLabel lbl1,lbl2;
	JTextField txt1,txt2;
 
	public gui10()
	{
	FlowLayout Fl= new FlowLayout();
	this.setLayout(Fl);

	this.setTitle("Hello world");
	this.setSize(400,400);
	
	btn1= new JButton("compute");
	lbl1= new JLabel("Value");
	lbl2= new JLabel("Result");
	txt1= new JTextField(20);
	txt2= new JTextField(20);

	txt2.setEditable(false);

	btn1.addActionListener(this);

	this.add(lbl1);
	this.add(txt1);
	this.add(lbl2);
	this.add(txt2);
	this.add(btn1);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
	int a=Integer.parseInt(txt1.getText());
	int b=a*a*a;
	txt2.setText(String.valueOf(b));
	}

	}//class

class c15
{
public static void main(String[]args)
{
gui10 obj= new gui10();
obj.setVisible(true);
}

}