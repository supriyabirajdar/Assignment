/*Rent of car is 15 rupees per kilometre for first 120 kilometres
and after that it is 10 rupees per kilometre. Accept total number
of kilometres and calculate rent. 
  15 rs for 1km
  x for 80km
15*80=1*x
15*80/1 = x*/
import java.util.Scanner;
class One
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers of kilometers");
		int a = s.nextInt();
		 
		if(a <= 120)
		{
			int x = 15*a/1;
			System.out.println("The rent is = "+x);
		}
		else
		{
			int y = 10*a/1;
			System.out.println("The rent is = "+y);
		}
		
	}
}
 