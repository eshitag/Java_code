import java.util.Scanner;
class t6
{
	public static void main(String[]args)
  	{
	Scanner obj= new Scanner(System.in);
	int[] marks= new int[5];

	System.out.print("Enter marks of 5 subjects");
	for(int i=0;i<5;i++)
{
marks[i]=obj.nextInt();
}
	int t=0;
	for(int i=0;i<5;i++)
{
	System.out.println("subject "+(i+1)+":\t"+marks[i]);
	t=t+marks[i];
}
	System.out.println("Obtained marks:\t"+t);
	float per= ((float)t/500)*100;
	System.out.println("Percentage:\t"+per);
	}
}