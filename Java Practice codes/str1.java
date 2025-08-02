import java.util.Scanner;
class str1
{
	public static void main(String[]args)
	{
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter your username.");
	String u=obj.next();

	System.out.print("Enter your password!");
	String p=obj.next();

	int x=u.length();
	int y=p.length();
	if(x<5||y<5)
{
System.out.print("username and password too weak!");
}
else
{
System.out.println("username:"+u);
System.out.println("password:"+p);
}	 
	}

}