/* Accept range from user and print all numbers between that range in
reverse order*/
import java.util.Scanner;
 public class Ten
 {
	 public static void main(String[] args)
	 {
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the first number");
		  int a = s.nextInt();
		  System.out.println("Enter the second number");
		  int b = s.nextInt();
		  sumEven(a,b);
	 }
	 
	 public static void sumEven(int x, int y)
	 {
		
		for(int i = y; i>=x;i--)
			{
			
			
			System.out.println(" "+i+" ");
			
			}
		
        			
	 }
	 
 }
 
