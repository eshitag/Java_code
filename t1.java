import java.util.Scanner;
class p2
{
	public static void main(String[]args)
	{
	Scanner obj=new Scanner(System.in);
	char x;
	System.out.print("Enter any character value");
	 x = obj.next().charAt(0);
 	if( x=='a'||x=='e'||x=='i'||x=='o'||x=='u' )
	{
	System.out.print("character " + x + "is a Vowel");
	}
	else
	{
	  System.out.print("character" + x + "is a consonent");
	}	
	}
}