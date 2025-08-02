import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

class gui17 extends JFrame implements ActionListener
{
JButton btn1,btn2;
JLabel lbl1,lbl2;
JTextField txt1,txt2;

	public gui17()
	{
	FlowLayout FL=new FlowLayout();
	this.setLayout(FL);
	
	this.setSize(80,400);
	this.setTitle("assignment3");

	btn1= new JButton("show name");
	btn2= new JButton("show father's name");
	lbl1= new JLabel("Name");
	txt1= new JTextField(20);
	lbl2= new JLabel("Father's name");
	txt2= new JTextField(20);
	
	lbl1.setFont(new Font("elephant",Font.ITALIC,16));
	lbl2.setFont(new Font("elephant",Font.ITALIC,16));

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
	Object source=evt.getSource();
 	if(source==btn1)
{
JOptionPane.showMessageDialog(null,txt1.getText(),"my name",JOptionPane.INFORMATION_MESSAGE);
}
	else if(source==btn2)
{
JOptionPane.showMessageDialog(null,txt2.getText(),"father's name",JOptionPane.WARNING_MESSAGE);
}	
	}

}

class c20
{
	public static void main(String[]args)
	{
	gui17 obj= new gui17();
	obj.setVisible(true);
	}
}