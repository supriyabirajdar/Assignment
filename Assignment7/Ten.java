/*   Accept number from user and return its generic root. */
import java.util.Scanner;

public class Ten{
	
	public static void main(String[] args) 
	{
		int Number, Sum, Reminder;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Integer Value : ");
		Number = sc.nextInt();	
		
		while(Number >= 10)
		{
			for (Sum=0; Number > 0; Number= Number/10)
		    {
				Reminder = Number % 10;
				Sum=Sum + Reminder;  
		    }
		    if(Sum >= 10)
		    {
		    	Number = Sum;
		    }
		    else
		    {
		    	System.out.println("\n The Generic Root of a Given Number = " + Sum);
		    }
		}
	}
}