class student
{
protected int registrationid;
protected String name;
protected String collegename;

public void setInfo(int rid,String nm,String clg)
{
 registrationid=rid;
 name=nm;
collegename=clg;
}
public void showInfo()
{
System.out.print("registration id is "+registrationid);
System.out.print("Name is "+name);
System.out.print("College name is "+collegename);
}

} //class student

class studentInfo extends student
{
private int corejava;
private int sql;
private int project;

public void setmarks(int cj,int s,int p)
{
corejava=cj;
sql=s;
project=p;
}
public void showmarks()
{
System.out.print("marks of "+registrationid);
System.out.print("core java "+corejava);
System.out.print("sql "+sql);
System.out.print("project marks "+project);
}
} // class studentinfo

class c33
{
public static void main(String[]args)
{
studentInfo si= new studentInfo();

si.setInfo(102,"eshita","uiet");
si.showInfo();
si.setmarks(66,88,65);
si.showmarks();
}
}