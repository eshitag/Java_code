import java.util.Scanner;
class fun4
{
	static float computeInterest(float pa,float roi,int time)
	{
	float interest= (pa*roi*time)/100;
	return interest;
	}
	/*static void userInput()					 //multiplereturntypes??
	{
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the amount to calculate Interest");
	float pa=obj.nextFloat();
	System.out.print("Enter the rate of interest");
	float roi=obj.nextFloat();
	System.out.print("Enter the time period");
	int time=obj.nextInt();
	return pa;
	return roi;
	return time;
	}*/
public static void main(String[]args)
	{
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the amount to calculate Interest");
	float pa=obj.nextFloat();
	System.out.print("Enter the rate of interest");
	float roi=obj.nextFloat();
	System.out.print("Enter the time period");
	int time=obj.nextInt();

	// userInput();
	float interest=computeInterest(pa,roi,time);
	float totalAmount= pa+interest;
	System.out.print("total amount after interest is "+totalAmount);
	}



}