import java.util.Scanner;
class t11
{
	public static void main(String[]args)
{
 	Scanner obj= new Scanner(System.in);
	int[][] product = {{1,2,3,4},{5,6,6,7},{8,9,2,6},{3,4,6,9,}};
	int[][] transpose= new int[4][4];
	
for(int i=0;i<4;i++)
	{
	for(int j=0;j<4;j++)
	transpose[i][j]=product[j][i];
	}}
for(int i=0;i<4;i++)
	{
	for(int j=0;j<4;j++)
	{
	System.out.print(product[i][j]+"\t");	
	}
	System.out.print("\n");
	}	
	
}
}