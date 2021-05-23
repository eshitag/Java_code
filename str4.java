class str4
{

	public static void main(String[]args)
	{
	String str1="strings are a sequence of characters";
	String str2="strings are objects";
	String str3="string class is immutable";


	int var1=str1.compareTo(str2);
	int var2=str2.compareTo(str3);

	System.out.println("string 1 and string 2 comparison "+ var1);
	System.out.println("string 2 and string 3 comparison "+ var2);
	}
}