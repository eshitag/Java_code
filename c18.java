import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;

class gui15 extends JFrame implements ActionListener
{
JButton btn1,btn2;
JLabel lbl1,lbl2,lbl3,lbl4;
JTextField txt1,txt2,txt3,txt4;

	public gui15()
	{
	FlowLayout FL=new FlowLayout();
	this.setLayout(FL);
	
	this.setSize(80,400);
	this.setTitle("assignment1");

	btn1= new JButton("compute");
	btn2= new JButton("exit");
	lbl1= new JLabel("amount");
	txt1= new JTextField(20);
	lbl2= new JLabel("rate of Interest");
	txt2= new JTextField(20);
	lbl3= new JLabel("time");
	txt3= new JTextField(20);
	lbl4= new JLabel("interest");
	txt4= new JTextField(20);
	
	txt4.setEditable(false);

	btn1.addActionListener(this);
	btn2.addActionListener(this);	

	this.add(lbl1);
	this.add(txt1);
	this.add(lbl2);
	this.add(txt2);
	this.add(lbl3);
	this.add(txt3);
	this.add(lbl4);
	this.add(txt4);
	this.add(btn1);
	this.add(btn2);
	}

	public void actionPerformed(ActionEvent evt)
	{
	Object source=evt.getSource();
 	if(source==btn1)
{
float a=Float.parseFloat(txt1.getText());
float b=Float.parseFloat(txt2.getText());
float c=Float.parseFloat(txt3.getText());

float result= (a*b*c)/100;

txt4.setText(String.valueOf(result));
}
	else if(source==btn2)
{
this.dispose();
}	
	}

}

class c18
{
	public static void main(String[]args)
	{
	gui15 obj= new gui15();
	obj.setVisible(true);
	}
}