class product
{
private String ProductName;
public product(String pnm)
{
ProductName=pnm;
}

public String toString()
{
return ProductName;
}

}

class c38
{
public static void main(String[]args)
{
product obj= new product("laptop");
String x=obj.toString();
System.out.print(x);
}

}