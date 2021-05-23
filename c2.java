class employee
{
	private int empid;
	private String name;
	private float Salary;

	public void setInfo(int eid,String nm, float sal)
{
if(sal>0)
{
	empid=eid;
	name=nm;
	Salary=sal;
}
else
{
throw new RuntimeException("salary is negative");
}
}

	public void showinfo()

{
	System.out.print("Employee Id is"+empid);
	System.out.print("Nmae is "+name);
	System.out.print("Salary is "+Salary);

}
} //employee class

class c2
{
	public static void main(String[]args)
{
	employee e1= new employee();
	e1.setInfo(4,"Eshita",40000);
	e1.showinfo();
}

}