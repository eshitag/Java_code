import java.util.Scanner;
class arr4
{
	public static void main(String[]args)
	{
	int[][]  population= new int[5][2];
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter the sector number and it's population");
	for(int i=0;i<5;i++)
	{
	population[i][0]=obj.nextInt();
	population[i][1]=obj.nextInt();
	}
	
	System.out.print("sector/tpopulation");
	for(int i=0;i<5;i++)
	{
	System.out.println(population[i][0]+"/t"+population[i][1]);
	}
	}

}