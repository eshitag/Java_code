import java.util.Scanner;
class p5
{ public static void main(String[]args)
{
  Scanner obj= new Scanner(System.in); 
  System.out.print("Enter your vehicle registration code");
  int x=obj.nextInt();
	switch (x)
	{
	case 1:
	System.out.print("Amritsar"); break;
	case 2:
	System.out.print("Bathinda"); break;
	case 3:
	System.out.print("Faridkot"); break;
	case 4:
	System.out.print("Ferozpur"); break;
	}
}
}