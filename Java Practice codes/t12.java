import java.util.Scanner;
class t12
{
	public static void main(String[]args)

{
 	Scanner obj=new Scanner(System.in);
	String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
	System.out.print("Enter any month number");
	int num=obj.nextInt();

	if(num<=12&&num>=1){
	for(int i=0;i<12;i++)
	{
		if(i+1==num)
		{
		System.out.print(months[i]);
		}
	}
			}
	else{
	System.out.print("Invalid month number");
	}			

}

}