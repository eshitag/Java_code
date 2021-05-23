import java.util.Scanner;
class p4
{ 
public static void main(String[]args)
{ 
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter the name of your vehicle");
	String vname=obj.next();
	
	System.out.println("Enter the distance covered in kms");
	float dist=obj.nextFloat();

	System.out.println("Enter the fuel consumed in litres");
	float fuel=obj.nextFloat();
	
	float avg= dist/fuel;
	System.out.println("your "+vname+" has "+avg+" average");
	if(avg>=24)
{
System.out.println("excellence average");
}
 	else if (avg>=18&&avg<=23)	
{
System.out.println("moderate average");
}
	else if(avg<18)
{
System.out.println("poor average");
}
}
}