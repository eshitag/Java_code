import java.util.Scanner;
class t7
{
	public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	int[] values= new int[10];
	System.out.println("Enter 10 integer values");
	for(int i=0;i<10;i++)
{
values[i]=obj.nextInt();
}
int max=0;
int t=0;
	for(int i=0;i<10;i++)
{
if(max<values[i])
max=values[i];
t=t+values[i];
}
System.out.println("Maximum value entered is "+max);
float avg=(float)t/10;
System.out.println("Average value is "+avg);
}
}