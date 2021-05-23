import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;

class gui11 extends JFrame implements ActionListener
	{
	JButton btn1,btn2;
	JLabel lbl1,lbl2;
	JTextField txt1,txt2;
 
	public gui11()
	{
	FlowLayout Fl= new FlowLayout();
	this.setLayout(Fl);

	this.setTitle("Hello world");
	this.setSize(400,400);
	
	btn1= new JButton("compute");
	btn2= new JButton("Exit");
	lbl1= new JLabel("Value");
	lbl2= new JLabel("Result");
	txt1= new JTextField(20);
	txt2= new JTextField(20);

	txt2.setEditable(false);

	btn1.addActionListener(this);
	btn2.addActionListener(this);

	this.add(lbl1);
	this.add(txt1);
	this.add(lbl2);
	this.add(txt2);
	this.add(btn1);
	this.add(btn2);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
	Object source= evt.getSource();

	if(source==btn1)
	{int a=Integer.parseInt(txt1.getText());
	int b=a*a*a;
	txt2.setText(String.valueOf(b));
	}
	else if(source==btn2)
	{
	JOptionPane.showMessageDialog(null,"exit");
	}

	}
	}//class

class c16
{
public static void main(String[]args)
{
gui11 obj= new gui11();
obj.setVisible(true);
}

}