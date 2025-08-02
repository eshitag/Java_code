import java.util.Scanner;
class r1
{
public static void main(String[]args)
{
Scanner obj= new Scanner(System.in);
System.out.print("enter your name");
String a=obj.next();

System.out.print("enter your bestfriend's name");
String b=obj.next();

System.out.print("enter any number");
int i=obj.nextInt();

if(i>10){
System.out.print(a);
 }
else{
System.out.print(b); 
}
}
}