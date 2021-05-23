import java.util.Scanner;
class str3
{

public static void main(String[]args)
{
Scanner obj= new Scanner(System.in);
System.out.print("Enter some text");
String s1=obj.next();

char ch= s1.charAt(0);
System.out.print("first letter you typed is "+ch);
}

}