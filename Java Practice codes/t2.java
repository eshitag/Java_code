import java.util.Scanner;
class p3
{
	public static void main(String[]args)
	{Scanner obj= new Scanner(System.in);
	int tck; 
	String seat; 
	int charges=0;
	System.out.print("Enter the number of tickets you want to book");
	tck= obj.nextInt();
	System.out.print("Enter the Seat type you will prefer");
	seat= obj.next();
	
	boolean b1= seat.equals("diamond");
	boolean b2= seat.equals("gold");
	boolean b3= seat.equals("silver");
	 
	 if(b1==true)
	 {  charges =400;
}
	 else if(b2==true)
	 { charges =300;
}

	else if(b3==true)
	 { charges =200;
}

	int tcharges = tck*charges;
	System.out.print("you have to pay Rs.  "+tcharges);
	}
}