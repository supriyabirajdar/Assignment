import java.util.Scanner;

public class Four 
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);

		
		System.out.print("Enter minute : ");

		int minute = in.nextInt(); 

		
		int p2 = minute / 60;
		int   minnutesRemaining = minute % 60;
	

		System.out.print(+p2 +"h\t" + minnutesRemaining + "m");
		System.out.print("\n");
	}  
}