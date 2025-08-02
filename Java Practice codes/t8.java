import java.util.Scanner;
class t8
{
	public static void main(String[]args)
{
  	Scanner obj= new Scanner(System.in);
	int[] elements= new int[10];
	System.out.print("enter 10 integer elements");
	for(int e:elements)
{
 e=obj.nextInt();
}
int even=0;
int odd=0;
for(int e:elements)
{
if(e%2==0)
{
even++;
}
else
{
odd++;
}}
System.out.print("no. of even elements "+even);
System.out.print("no. of odd elements "+odd);
}
}