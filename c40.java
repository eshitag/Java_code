abstract class base
{
	public void f1()
	{	
	}
	public abstract void f2();
	
}
 
class derived extends base
{
	public void f2()
	{
	}
}

class c40
{
	public static void main(String[]args)
{

derived obj= new derived();
}