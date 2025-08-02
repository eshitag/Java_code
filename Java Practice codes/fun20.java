import java.util.Scanner;

class fun20
{

	static int findMax(int...numbers)
	{
	int max=0;
	for(int n:numbers)
		{
		if(n>max)
		max=n;
		}
	return max;
	
	}
	public static void main(String[]args)
	{
	Scanner obj=new Scanner(System.in);
	System.out.print("enter some integer values");
	int...num=obj.nextInt();
	int result=findMax(int...num);
	System.out.print("Maximum value from numbers entered is "+result);
	}
}