class point
{
private int X;
private int Y;
private static int count;

public point(int x,int y)
{
	X=x;
	Y=y;
	count++;
}
public int getX()
{
	return X;
}
public int getY()
{
	return Y;
}
public static int getCount()
{
	return count;
}

}
class c30
{

public static void main(String[]args)
{
point p1=new point(2,8);
point p2=new point(10,20);
 
System.out.println(p1.getX());
System.out.println(p1.getY());
System.out.print(point.getCount());
}
}