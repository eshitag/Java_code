import java.util.Scanner;
class t5
{

	public static void main(String[]args)
	{
	Scanner obj= new Scanner(System.in);
	int[] values= new int[5];
	System.out.print("Enter any 5 integer values");
	
	for(int i=0;i<5;i++)
{
values[i]=obj.nextInt();
}
int t=0;
	for(int i=0;i<5;i++)
{
System.out.println(values[i]);
t=t+values[i];
}		
System.out.print("total of these values is "+t);
	}

}