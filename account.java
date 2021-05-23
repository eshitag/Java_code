import java.util.Scanner;

abstract class Account
{
	protected int accountno;
	
	protected float balance; 

	public void deposit(float amount)
	{
	balance=balance+amount;
	}

	public void withdraw(float amount)
	{
	balance=balance-amount;
	}
	
	public abstract void openAccount();
	
	public abstract void showAccount();
}//class

final class savings extends Account
{
private String name;
public void openAccount();
{
Scanner obj=new Scanner(System.in);
System.out.print("Enter your name");
name=obj.next();

}
public void showAccount();
{
System.out.print(name);
}
}// class

class current
{

	private String firmname;
	public final void openAccount();
{
Scanner obj=new Scanner(System.in);
System.out.print("Enter firm name");
firmname=obj.next();
}
	
	public final void showAccount();
{
System.out.print(firmname);
}
}

class c5
{
	public static void main(String[]args)
	{
	Account acc= new savings();
	acc.openAccount();
	acc.deposit(20100);
	acc.withdraw(1000);

	acc.showAccount();
	}

}