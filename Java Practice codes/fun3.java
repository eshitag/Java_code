import java.util.Scanner;
class fun3
{

	static int sq(int a)
	{
	int result=a*a;
	return result;
	}
	static void displaysq(int a,int result)
	{
	System.out.print("square of "+a+" is "+result);
	}
	public static void main(String[]args)
	{
	Scanner obj=new Scanner(System.in);
	
	System.out.print("Enter any number to calculate its square");
	int x=obj.nextInt();
	
	int result=sq(x);
	displaysq(x,result);	
	}
}