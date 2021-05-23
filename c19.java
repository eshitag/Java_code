import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;

class gui16 extends JFrame implements ActionListener
{
JButton btn1,btn2;
JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
JTextField txt1,txt2,txt3,txt4,txt5;

	public gui16()
	{
	FlowLayout FL=new FlowLayout();
	this.setLayout(FL);
	
	this.setSize(80,400);
	this.setTitle("assignment2");

	btn1= new JButton("compute");
	btn2= new JButton("exit");
	lbl1= new JLabel("Physics");
	txt1= new JTextField(20);
	lbl2= new JLabel("Chemistry");
	txt2= new JTextField(20);
	lbl3= new JLabel("Biology");
	txt3= new JTextField(20);
	lbl4= new JLabel("total");
	txt4= new JTextField(20);
	lbl5= new JLabel("per");
	txt5= new JTextField(20);
	
	txt4.setEditable(false);
	txt5.setEditable(false);

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
	this.add(lbl5);
	this.add(txt5);
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

float total=a+b+c;
float per= ((a+b+c)/300)*100;
txt4.setText(String.valueOf(total));
txt5.setText(String.valueOf(per));
}
	else if(source==btn2)
{
//JOptionPane.showConfirmDialog(null,"Are you sure?","confirmation",JOptionPane.YES_NO_OPTION);
int a=JOptionPane.showConfirmDialog(null,"are you sure?","confirmation",JOptionPane.WARNING_MESSAGE);
if(a==JOptionPane.YES_OPTION)
{
this.dispose();
}
}	
	}

}

class c19
{
	public static void main(String[]args)
	{
	gui16 obj= new gui16();
	obj.setVisible(true);
	}
}