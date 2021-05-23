import java.util.Scanner;
class t10
{
	public static void main(String[]args)
{
 	Scanner obj= new Scanner(System.in);
	String[][] product = new String[3][3];
	System.out.print("Enter product name, quantity and price");
for(int i=0;i<3;i++)
	{	
	product[i][0]=obj.next();
	product[i][1]=obj.next();
	product[i][2]=obj.next();
	}
	//int t=0;
	System.out.println("product\tquantity price");
for(int i=0;i<3;i++)
	{
	System.out.println(product[i][0]+"\t"+product[i][1]+"\t"+product[i][2]);
	//t=t+product[i][2];
	}
	//System.out.print("Grand Total\t"+t);
}
}