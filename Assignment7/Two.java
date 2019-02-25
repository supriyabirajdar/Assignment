/* Write a program which accept number from user and check
whether that number is strong number or not. When the sum of
the factorial of a number's individual digits are equal to the
number itself, then that number is called a strong number.*/

import java.util.Scanner;

public class Two {
	
	public static void main(String[] args) 
	{
		int Number, Temp, Reminder, Sum = 0, i, Factorial;
		 Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println(" TRUE");
		}
		else
		{
		   System.out.println("FALSE");
		}
	}
}