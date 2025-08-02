import java.util.Scanner;
class str2
{
	public static void main(String[]args)
	{
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter your greeting!");
	String msg=obj.next();
	System.out.print("Enter your friend's name :)");
	String f=obj.next();

	System.out.print(msg.concat(f));

	}

}