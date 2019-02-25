/* Parking charges for four whaler is 30 rupees for first three
hours and after every hour it is 5 rupees. Accept number of hours
and calculate total amount. 
30rs for 3hrs
x    for 5hr
30*5 = 3x
x = 30*5/3
*/
import java.util.Scanner;
class Two
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers of hours");
		int a = s.nextInt();
		 
		if(a <= 3)
		{
			int x = 30*a/3;
			System.out.println("The rent is = "+x);
		}
		else
		{
			int y = 5*a/3;
			System.out.println("The rent is = "+y);
		}
		
	}
}
 